package com.ecorp.LiquidBot.controller.handler.admin.impl;

import com.ecorp.LiquidBot.controller.handler.admin.AdminResponseHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import org.telegram.abilitybots.api.bot.AbilityBot;
import org.telegram.abilitybots.api.db.DBContext;
import org.telegram.abilitybots.api.sender.SilentSender;

@Component
@DependsOn(value = "LiquidAdminBot")
@Slf4j
public class AdminAuthHandler extends AdminResponseHandler {

    public AdminAuthHandler(AbilityBot bot) {
        super(bot.silent(), bot.db(), AdminAuthHandler.class.getSimpleName());
        log.info(AdminAuthHandler.class.getSimpleName());
        log.info(chatStates.toString());
    }


}
