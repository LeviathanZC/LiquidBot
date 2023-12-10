package com.ecorp.LiquidBot.controller.handler;

import com.ecorp.LiquidBot.controller.bot.Constants;
import org.telegram.abilitybots.api.db.DBContext;
import org.telegram.abilitybots.api.sender.SilentSender;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;

import java.util.*;

import static com.ecorp.LiquidBot.controller.bot.Constants.*;

public class AdminResponseHandler {

    private final SilentSender sender;
    private final Map<Long, UserAdminState> chatStates;

    private final Deque<Integer> messages;

    public AdminResponseHandler(SilentSender sender, DBContext db) {
        this.sender = sender;
        messages = new ArrayDeque<>();
        chatStates = db.getMap(Constants.ADMIN_STATE);
    }

    private void stopChat(long chatId) {
        sendAndSaveMsg(chatId, STOP_CHAT_MSG);
        chatStates.remove(chatId);
    }

    public void replyToStart(long chatId) {
        sendAndSaveMsg(chatId, START_ADMIN_DESC);
        sendAndSaveMsg(chatId, SEND_MSG_FOR_AUTHOR);
        chatStates.put(chatId, UserAdminState.AUTHORIZATION);
    }




    public void replyTo(long chatId, Message message) {
        if (message.getText().equalsIgnoreCase("/stop")) {
            stopChat(chatId);
        }

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
                sendAndSaveMsg(chatId, Constants.UNEXPECTED_MSG);
            }
        }
    }

    private void replyToAuthorization(long chatId, Message message) {

    }

    private void replyToMainMenuButtons(long chatId, Message message) {

    }


    private void sendAndSaveMsg(long chatId, String text) {
        messages.add(
                MessageHandler.getWithSender(sender)
                        .prompt(chatId, text)
        );
    }

    private void sendAndSaveMsgWithKeyboard(long chatId, String text, ReplyKeyboard keyboard) {
        messages.add(
                MessageHandler.getWithSender(sender)
                        .promptWithKeyboard(chatId, text, keyboard)
        );
    }

    public boolean userIsActive(Long chatId) {
        return chatStates.containsKey(chatId);
    }


}
