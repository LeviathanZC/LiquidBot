package com.ecorp.LiquidBot.model.entity.user;

public enum UserRole {

    ADMIN("Администратор"),
    TECH_SUPPORT("Тех. поддержка"),
    MANAGER("Продавец"),
    CLIENT("Клиент"),
    BANNED("Заблокированный"),
    UNDEFINED("Не определён");

    private final String type;

    UserRole(String type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return type;
    }

}
