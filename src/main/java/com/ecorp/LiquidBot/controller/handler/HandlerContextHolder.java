package com.ecorp.LiquidBot.controller.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.abilitybots.api.db.DBContext;
import org.telegram.abilitybots.api.sender.SilentSender;

public class HandlerContextHolder {

    private final SilentSender silent;
    private final DBContext db;

    public HandlerContextHolder(SilentSender silent, DBContext dbContext) {
        this.silent = silent;
        this.db = dbContext;
    }



}
