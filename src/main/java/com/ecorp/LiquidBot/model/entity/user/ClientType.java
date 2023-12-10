package com.ecorp.LiquidBot.model.entity.user;

public enum ClientType {

    POTENTIAL("Потенциальный"),
    INCIDENTAL("Инцидентальный"),
    TEMPORARY("Временный"),
    STANDARD("Обычный"),
    LOYAL("Лояльный"),
    REGULAR("Постоянный"),
    ACTIVE("Активный"),
    VERY_ACTIVE("Очень активный"),
    CONSTANT_ADMIRER("Постоянный поклонник"),
    KEY_PARTNER("Ключевой партнёр");

    private final String type;

    ClientType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

}
