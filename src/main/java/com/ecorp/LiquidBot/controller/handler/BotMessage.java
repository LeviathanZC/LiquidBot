package com.ecorp.LiquidBot.controller.handler;

import lombok.Builder;
import lombok.Getter;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;

@Builder
@Getter
public class BotMessage {

    private long chatId;

    private String text;

    private ReplyKeyboard keyboard;

}
