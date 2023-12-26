package com.ecorp.LiquidBot.controller.handler.admin;

import com.ecorp.LiquidBot.controller.handler.admin.AdminResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.abilitybots.api.db.DBContext;
import org.telegram.abilitybots.api.sender.SilentSender;

public class AdminMainHandler extends AdminResponseHandler {

    @Autowired
    public AdminMainHandler(SilentSender sender) {
        super(sender);
    }
}
