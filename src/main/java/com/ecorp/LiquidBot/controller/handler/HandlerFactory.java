package com.ecorp.LiquidBot.controller.handler;

import com.ecorp.LiquidBot.controller.bot.LiquidAdminBot;
import com.ecorp.LiquidBot.controller.handler.admin.impl.AdminCityHandler;
import com.ecorp.LiquidBot.controller.handler.admin.AdminMainHandler;
import com.ecorp.LiquidBot.controller.handler.admin.AdminResponseHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.abilitybots.api.bot.AbilityBot;

import java.util.HashMap;
import java.util.Map;

import static com.ecorp.LiquidBot.controller.handler.AdminHandlerType.*;

@Configuration
public class HandlerFactory {



    public static Map<AdminHandlerType, AdminResponseHandler> createAdminHandlerMap(LiquidAdminBot bot) {
        Map<AdminHandlerType, AdminResponseHandler> handlerMap = new HashMap<>();

        handlerMap.put(MAIN, AdminHandlerFactory.obtainMainHandler(bot));
        handlerMap.put(CITY, AdminHandlerFactory.obtainCityHandler(bot));

        return handlerMap;
    }

    private static class AdminHandlerFactory {

        @Bean
        public static AdminMainHandler obtainMainHandler(AbilityBot bot) {
            return new AdminMainHandler(bot.silent());
        }

        @Bean
        public static AdminCityHandler obtainCityHandler(AbilityBot bot) {
            return new AdminCityHandler(bot.silent());
        }

    }
}
