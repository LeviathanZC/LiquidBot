package com.ecorp.LiquidBot.model.entity.enums;

public enum UserType {

    ADMIN("Администратор"),
    TECH_SUPPORT("Тех. поддержка"),
    MANAGER("Продавец"),
    CLIENT("Клиент"),
    BANNED("Заблокированный"),
    UNDEFINED("Не определён");

    private final String type;

    UserType(String type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return type;
    }

}
