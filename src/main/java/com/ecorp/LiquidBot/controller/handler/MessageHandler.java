package com.ecorp.LiquidBot.controller.handler;

import org.telegram.abilitybots.api.sender.SilentSender;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;


public class MessageHandler {

    private static MessageHandler instance;

    private MessageHandler() {}

    private static SilentSender currentSender;

    public static MessageHandler getInstance() {
        if (instance == null) {
            instance = new MessageHandler();
        }
        return instance;
    }

    public static MessageHandler getWithSender(SilentSender sender) {
        currentSender = sender;
        return getInstance();
    }


    public int prompt(long chatId, String text) {
        return promptWithKeyboard(chatId, text, KeyboardFactory.removeKeyboard());
    }

    public int promptWithKeyboard(long chatId, String text,
                                                   ReplyKeyboard keyboard) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);
        sendMessage.setReplyMarkup(keyboard);
        return currentSender.execute(sendMessage).get().getMessageId();
    }

}
