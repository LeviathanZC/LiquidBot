package com.ecorp.LiquidBot.model.entity;

public class Settings {

    private String phone;
    private String city;
    private boolean isNotify;

    public Settings() {
        this("");
    }

    public Settings(String phone) {
        this(phone, "");
    }

    public Settings(String phone, String city) {
        this(phone, city, false);
    }

    public Settings(String phone, String city, boolean isNotify) {
        this.phone = phone;
        this.city = city;
        this.isNotify = isNotify;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isNotify() {
        return isNotify;
    }

    public void setNotify(boolean isNotify) {
        this.isNotify = isNotify;
    }

    @Override
    public String toString() {
        String delimiter = "\n\t";
        final StringBuilder sb = new StringBuilder(
                this.getClass().getSimpleName().concat(" {")
        );
        sb.append(delimiter).append("phone: ").append(this.getPhone()).append(',');
        sb.append(delimiter).append("city: ").append(this.getCity()).append(',');
        sb.append(delimiter).append("isNotify: ").append(this.isNotify());
        return sb.append("\n}").toString();
    }

}
