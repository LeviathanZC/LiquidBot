package com.ecorp.LiquidBot.controller.handler;

import com.ecorp.LiquidBot.controller.util.KeyboardFactory;
import org.telegram.abilitybots.api.db.DBContext;
import org.telegram.abilitybots.api.sender.SilentSender;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;

import java.util.Map;

public abstract class ResponseHandler {

    private static final String MESSAGE_LIST_SUFFIX = "_messageList";

    protected final SilentSender silentSender;

    protected Map<Long, Integer> messageList;

    protected ResponseHandler(SilentSender silentSender, DBContext db, String handlerName) {
        this.silentSender = silentSender;
        this.messageList = db.getMap(handlerName + MESSAGE_LIST_SUFFIX);
    }



    protected void sendTextMessageTo(long chatId, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);
        int messageID = silentSender.execute(sendMessage).get().getMessageId();
        messageList.put(chatId, messageID);
    }

    protected void sendTextMessageWithKeyboardTo(long chatId, String text,
                                  ReplyKeyboard keyboard) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);
        sendMessage.setReplyMarkup(keyboard);
        int messageID = silentSender.execute(sendMessage).get().getMessageId();
        messageList.put(chatId, messageID);
    }

    protected void removeKeyboardAndSendTextMessageTo(long chatId, String text) {
        sendTextMessageWithKeyboardTo(chatId, text, KeyboardFactory.getInstance().removeKeyboard());
    }



    public abstract void replyTo(long chatId, Message message);

    public abstract void replyToStart(long chatId);

    protected abstract void replyToStop(long chatId);



    public abstract boolean userIsActive(long chatId);
}
