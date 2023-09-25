package com.ecorp.LiquidBot.model.entity;

public class Settings {

    public long id;
    private String phone;
    private String city;
    private boolean isNotify;

    public Settings() {
        this(-1);
    }

    public Settings(long id) {
        this(id, "");
    }

    public Settings(long id, String city) {
        this(id, city, "");
    }

    public Settings(long id, String city, String phone) {
        this(id, city, phone, false);
    }

    public Settings(long id, String phone, String city, boolean isNotify) {
        this.id = id;
        this.phone = phone;
        this.city = city;
        this.isNotify = isNotify;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        sb.append(delimiter).append("id: ").append(this.getId()).append(',');
        sb.append(delimiter).append("phone: ").append(this.getPhone()).append(',');
        sb.append(delimiter).append("city: ").append(this.getCity()).append(',');
        sb.append(delimiter).append("isNotify: ").append(this.isNotify());
        return sb.append("\n}").toString();
    }

    @Override
    public int hashCode() {
        final int prime = 113;
        int result = 1;

        result = (int) ((result * prime) + (id ^ (id >>> 32)));
        result = (result * prime) + phone.hashCode();
        result = (result * prime) + city.hashCode();
        result = (result * prime) + (isNotify ? 1 : 0);

        return result;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (o == null || o.getClass() == this.getClass()) {
            return false;
        }

        Settings that = (Settings) o;

        if (this.id != that.getId()) return false;
        if (!this.phone.equals(that.getPhone())) return false;
        if (!this.city.equals(that.getCity())) return false;
        return (this.isNotify = that.isNotify());
    }

}
