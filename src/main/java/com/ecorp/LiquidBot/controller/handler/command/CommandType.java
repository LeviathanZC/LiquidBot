package com.ecorp.LiquidBot.controller.handler.command;

public enum CommandType {



    private final Command command;

    CommandType(Command command) {
        this.command = command;
    }

    public Command getCurrentCommand() {
        return command;
    }
}
