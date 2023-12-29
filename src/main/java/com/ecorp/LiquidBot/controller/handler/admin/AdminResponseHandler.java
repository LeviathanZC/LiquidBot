package com.ecorp.LiquidBot.controller.handler.admin;

import com.ecorp.LiquidBot.controller.handler.ResponseHandler;
import com.ecorp.LiquidBot.controller.handler.UserAdminState;
import com.ecorp.LiquidBot.controller.util.Constants;
import lombok.extern.slf4j.Slf4j;
import org.telegram.abilitybots.api.db.DBContext;
import org.telegram.abilitybots.api.sender.SilentSender;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;

import java.io.Serializable;
import java.util.*;

import static com.ecorp.LiquidBot.controller.util.Constants.*;


@Slf4j
public abstract class AdminResponseHandler extends ResponseHandler {

    private static final String DB_ADMIN_PREFIX = "admin/";
    private static final String DB_ADMIN_STATE = "_states";


    protected final Map<Long, UserAdminState> chatStates;


    protected AdminResponseHandler(SilentSender sender, DBContext db, String handlerName) {
        super(sender, db, handlerName);
        this.chatStates = db.getMap(DB_ADMIN_PREFIX + handlerName + DB_ADMIN_STATE);
        log.info(chatStates.toString());
    }

    protected void replyToStop(long chatId) {
        log.info("stop chat with '{}'", chatId);
        prompt(chatId, STOP_CHAT_MSG);
        chatStates.remove(chatId);
    }

    public void replyToStart(long chatId) {
        log.info("start chat with '{}'", chatId);
        prompt(chatId, START_ADMIN_DESC);
        prompt(chatId, SEND_MSG_FOR_AUTHOR);
        chatStates.put(chatId, UserAdminState.AUTHORIZATION);
    }

    protected void stopRequest(long chatId, Message message) {
        if (message.getText().equalsIgnoreCase("/stop")) {
            replyToStop(chatId);
        }
    }


    public void replyTo(long chatId, Message message) {
        stopRequest(chatId, message);

        switch (chatStates.get(chatId)) {
            case AUTHORIZATION: {
                replyToAuthorization(chatId, message);
                break;
            }
            case MAIN_MENU: {
                replyToMainMenuButtons(chatId, message);
                break;
            }
            default : {
                prompt(chatId, Constants.UNEXPECTED_MSG);
            }
        }
    }

    private void replyToAuthorization(long chatId, Message message) {
        System.out.println("GET IT!!!");
    }

    private void replyToMainMenuButtons(long chatId, Message message) {

    }




    protected void prompt(long chatId, String text) {
        log.info("send text '{}' to '{}'", text, chatId);
        sendTextMessageTo(chatId, text);
    }

    protected void promptWithKB(long chatId, String text, ReplyKeyboard keyboard) {
        log.info("send text '{}' with keyboard {} to '{}'", text, keyboard, chatId);

        sendTextMessageWithKeyboardTo(chatId, text, keyboard);
    }

    protected void promptRemoveKB(long chatId, String text) {
        log.info("remove keyboard and send text '{}' to '{}'", text, chatId);
        removeKeyboardAndSendTextMessageTo(chatId, text);
    }

    public boolean userIsActive(long chatId) {
        return chatStates.containsKey(chatId);
    }


}
