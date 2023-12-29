package com.ecorp.LiquidBot.controller.bot;

import com.ecorp.LiquidBot.controller.handler.HandlerContextHolder;
import com.ecorp.LiquidBot.controller.handler.ResponseHandler;
import com.ecorp.LiquidBot.controller.handler.admin.AdminResponseHandler;
import com.ecorp.LiquidBot.controller.handler.admin.impl.AdminAuthHandler;
import com.ecorp.LiquidBot.controller.util.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.telegram.abilitybots.api.bot.AbilityBot;
import org.telegram.abilitybots.api.bot.BaseAbilityBot;
import org.telegram.abilitybots.api.db.DBContext;
import org.telegram.abilitybots.api.objects.Ability;
import org.telegram.abilitybots.api.objects.Flag;
import org.telegram.abilitybots.api.objects.Reply;
import org.telegram.abilitybots.api.sender.SilentSender;
import org.telegram.telegrambots.meta.api.objects.Update;

import javax.annotation.PostConstruct;
import java.util.function.BiConsumer;

import static org.telegram.abilitybots.api.objects.Locality.USER;
import static org.telegram.abilitybots.api.objects.Privacy.PUBLIC;
import static org.telegram.abilitybots.api.util.AbilityUtils.getChatId;

@Slf4j
@Component(value = "LiquidAdminBot")
public class LiquidAdminBot extends AbilityBot {


    private HandlerContextHolder contextHolder;

    private AdminAuthHandler responseHandler;


    @Autowired
    public LiquidAdminBot(Environment env) {
        super(env.getProperty("LIQUID_ADMIN_BOT_TOKEN"), "l_i_q_u_i_d_admin_bot");
    }

    //@Autowired
    public void setContextHolder(HandlerContextHolder contextHolder) {
        this.contextHolder = contextHolder;
        this.responseHandler = contextHolder.getInitial();
    }

    public Ability startBot() {
        return Ability
                .builder()
                .name("start")
                .info(Constants.START_ADMIN)
                .locality(USER)
                .privacy(PUBLIC)
                .action(ctx -> responseHandler.replyToStart(ctx.chatId()))
                .build();
    }


    public Reply replyToText() {

        BiConsumer<BaseAbilityBot, Update> action = (abilityBot, upd) -> responseHandler.replyTo(getChatId(upd), upd.getMessage());
        return Reply.of(action, Flag.TEXT, upd -> responseHandler.userIsActive(getChatId(upd)));
    }

    @Override
    public long creatorId() {
        return 1L;
    }

}
