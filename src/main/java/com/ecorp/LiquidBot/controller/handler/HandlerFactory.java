package com.ecorp.LiquidBot.controller.handler;

import com.ecorp.LiquidBot.controller.bot.LiquidAdminBot;
import com.ecorp.LiquidBot.controller.handler.admin.impl.AdminAuthHandler;
import com.ecorp.LiquidBot.controller.handler.admin.impl.AdminCityHandler;
import com.ecorp.LiquidBot.controller.handler.admin.AdminResponseHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.abilitybots.api.bot.AbilityBot;
import org.telegram.abilitybots.api.db.DBContext;
import org.telegram.abilitybots.api.sender.SilentSender;

import java.util.HashMap;
import java.util.Map;

import static com.ecorp.LiquidBot.controller.handler.AdminHandlerType.*;

@Configuration
public class HandlerFactory {


    /*@Bean
    public static AdminAuthHandler obtainAuthHandler(AbilityBot bot) {
        return new AdminAuthHandler(bot);
    }*/
/*
    public static Map<AdminHandlerType, AdminResponseHandler> createAdminHandlerMap(LiquidAdminBot bot) {
        Map<AdminHandlerType, AdminResponseHandler> handlerMap = new HashMap<>();

        //handlerMap.put(CITY, AdminHandlerFactory.obtainCityHandler(bot));

        return handlerMap;
    }
*/
    /*private static class AdminHandlerFactory {

        *//*@Bean
        public static AdminAuthHandler obtainAuthHandler(AbilityBot bot) {
            return new AdminAuthHandler(bot.silent(), bot.db());
        }*//*

        @Bean
        public static AdminCityHandler obtainCityHandler(AbilityBot bot) {
            return new AdminCityHandler(bot.silent());
        }

    }*/
}
