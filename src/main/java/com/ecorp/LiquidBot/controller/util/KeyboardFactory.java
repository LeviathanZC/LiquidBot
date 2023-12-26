package com.ecorp.LiquidBot.controller.util;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardRemove;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.List;

public class KeyboardFactory {

    private static KeyboardFactory instance;

    private KeyboardFactory() {}

    public static KeyboardFactory getInstance() {
        if (instance == null) {
            instance = new KeyboardFactory();
        }
        return instance;
    }

    public ReplyKeyboard removeKeyboard() {
        return new ReplyKeyboardRemove(true);
    }

    public ReplyKeyboard getAuthorisationKeyboard() {
        KeyboardRow row = new KeyboardRow();
        row.add(Constants.AUTHORISATION_BUTTON_TEXT);
        return new ReplyKeyboardMarkup(List.of(row));
    }

}
