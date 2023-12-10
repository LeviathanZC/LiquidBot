package com.ecorp.LiquidBot.model.entity.management;

public enum Taste {

    SWEET("Сладкий"),
    ACID("Кислый"),
    BAKING("Выпечка"),
    BERRY("Ягодный"),
    TABACCO("Табачный"),
    COOLER("Холодок"),
    FRUIT("Фруктовый"),
    MILKY("Молочный"),
    UNUSUAL("Необычный"),
    UNDEFINED("Не определён");

    private final String taste;

    Taste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return taste;
    }
    
}
