package com.ecorp.LiquidBot.controller.handler.command;

import com.ecorp.LiquidBot.controller.handler.BotMessage;
import org.telegram.abilitybots.api.sender.MessageSender;

public interface Command {

    void execute(MessageSender sender, BotMessage message);

}
