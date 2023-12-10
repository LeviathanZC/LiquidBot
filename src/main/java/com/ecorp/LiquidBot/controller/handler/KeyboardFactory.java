package com.ecorp.LiquidBot.controller.handler;

import com.ecorp.LiquidBot.controller.bot.Constants;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardRemove;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.List;

public class KeyboardFactory {

    public static ReplyKeyboard removeKeyboard() {
        return new ReplyKeyboardRemove(true);
    }

    public static ReplyKeyboard getAuthorisationKeyboard() {
        KeyboardRow row = new KeyboardRow();
        row.add(Constants.AUTHORISATION_BUTTON_TEXT);
        return new ReplyKeyboardMarkup(List.of(row));
    }

}
