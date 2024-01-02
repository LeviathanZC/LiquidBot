package com.ecorp.LiquidBot.controller.handler.roles.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.abilitybots.api.db.DBContext;
import org.telegram.abilitybots.api.sender.SilentSender;
import org.telegram.telegrambots.meta.api.objects.Message;


@Slf4j
public class AdminResponseHandlerImpl extends AdminResponseHandler {

    public AdminResponseHandlerImpl(SilentSender silent, DBContext db) {
        super(silent, db, AdminResponseHandlerImpl.class.getSimpleName());
        log.info(AdminResponseHandlerImpl.class.getSimpleName());
        log.info(chatStates.toString());
    }

    public void replyTo(long chatId, Message message) {

    }

}
