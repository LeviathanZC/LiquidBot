package com.ecorp.LiquidBot.controller.handler.admin.impl;

import com.ecorp.LiquidBot.controller.handler.admin.AdminResponseHandler;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import org.telegram.abilitybots.api.db.DBContext;
import org.telegram.abilitybots.api.sender.SilentSender;

//@Component
//@DependsOn(value = "LiquidAdminBot")
public class AdminCityHandler extends AdminResponseHandler {


    public AdminCityHandler(SilentSender silent, DBContext db) {
        super(silent, db, AdminCityHandler.class.getSimpleName());
    }
}
