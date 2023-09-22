package com.ecorp.LiquidBot.model.entity.enums;

public enum OrderStatus {

    EMPTY("Пустой"),
    UNRESERVED("Не зарезервирован"),
    RESERVED("Зарезервирован"),
    PROCESSING("В обработке"),
    CANCELLED("Отменён"),
    ACCEPTED("Принят"),
    SHIPPING("В пути"),
    ARRIVED("На месте"),
    TIMEOUT("Время ожидания вышло"),
    RED_FLAG("Красный"),
    CLOSED("Закрыт"),
    UNDEFINED("Не определён");

    private final String status;

    OrderStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }

}
