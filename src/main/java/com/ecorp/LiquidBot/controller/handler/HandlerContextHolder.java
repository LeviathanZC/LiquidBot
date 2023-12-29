package com.ecorp.LiquidBot.controller.handler;

import com.ecorp.LiquidBot.controller.handler.admin.AdminResponseHandler;
import com.ecorp.LiquidBot.controller.handler.admin.impl.AdminAuthHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import org.telegram.abilitybots.api.bot.AbilityBot;
import org.telegram.abilitybots.api.db.DBContext;
import org.telegram.abilitybots.api.sender.SilentSender;

import java.lang.reflect.InvocationTargetException;

@Slf4j
@Component(value = "HandlerContextHolder")
@DependsOn(value = "LiquidAdminBot")
public class HandlerContextHolder {

    private final SilentSender silent;
    private final DBContext db;

    @Autowired
    public HandlerContextHolder(AbilityBot bot) {
        this.silent = bot.silent();
        this.db = bot.db();
        log.info("HandlerContextHolder has been created");
    }

    private AdminAuthHandler auth;

    @Autowired
    public void setAuth(AdminAuthHandler handler) {
        this.auth = handler;
    }

    public AdminAuthHandler getInitial() {
        return auth;
    }



}
