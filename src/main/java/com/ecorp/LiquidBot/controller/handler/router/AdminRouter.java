package com.ecorp.LiquidBot.controller.handler.router;

import com.ecorp.LiquidBot.controller.handler.AdminState;

public class AdminRouter extends Router {

    private AdminState state;

    public AdminRouter(AdminState state) {
        this.state = state;
    }

    public void setNextState(AdminState state) {
        this.state = state;
    }



}
