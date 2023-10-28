package com.ecorp.LiquidBot.model.entity.nomenclature;

import com.ecorp.LiquidBot.model.entity.enums.Taste;

public class Nomenclature {

    private long id;
    private Category category;
    private String country;

    // фирма, которая делает
    private Brand brand;

    private String name;

    // линейка товара
    private String productLine;
    private String productImage;
    private String description;
    private boolean isAvailable;

    // общее количество товара
    private int totalQuantity;
    // количество товара в продаже
    private int inStockQuantity;
    // количество товара в резерве
    private int bookedQuantity;

    private int price;
    private int purchasePrice;



    private int volume; // ВПЖ


    private int pg; // ВПЖ
    private int vg; // ВПЖ


    private int strength; // ОЖ
    private boolean isCooling; // ОЖ


    // конкретный вкус, пример: табак-апельсин
    private String detailedTaste; // ОЖ
    // общий вкус, пример: табак
    private Taste overallTaste; // ОЖ


    private boolean isBatteryIntegrated; // В

    private String color; // ВПО


    private boolean hasDisplay; // ВП
    private boolean hasPowerController; // ВП
    private int batteryCapacity; // ВП
    private int puffCounter; // ВПО

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPg() {
        return pg;
    }

    public void setPg(int pg) {
        this.pg = pg;
    }

    public int getVg() {
        return vg;
    }

    public void setVg(int vg) {
        this.vg = vg;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean isCooling() {
        return isCooling;
    }

    public void setCooling(boolean cooling) {
        isCooling = cooling;
    }

    public String getDetailedTaste() {
        return detailedTaste;
    }

    public void setDetailedTaste(String detailedTaste) {
        this.detailedTaste = detailedTaste;
    }

    public Taste getOverallTaste() {
        return overallTaste;
    }

    public void setOverallTaste(Taste overallTaste) {
        this.overallTaste = overallTaste;
    }

    public boolean isBatteryIntegrated() {
        return isBatteryIntegrated;
    }

    public void setBatteryIntegrated(boolean batteryIntegrated) {
        isBatteryIntegrated = batteryIntegrated;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasDisplay() {
        return hasDisplay;
    }

    public void setHasDisplay(boolean hasDisplay) {
        this.hasDisplay = hasDisplay;
    }

    public boolean isHasPowerController() {
        return hasPowerController;
    }

    public void setHasPowerController(boolean hasPowerController) {
        this.hasPowerController = hasPowerController;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getPuffCounter() {
        return puffCounter;
    }

    public void setPuffCounter(int puffCounter) {
        this.puffCounter = puffCounter;
    }
}
