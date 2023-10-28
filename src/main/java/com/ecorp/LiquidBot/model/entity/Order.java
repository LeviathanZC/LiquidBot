package com.ecorp.LiquidBot.model.entity;

import com.ecorp.LiquidBot.model.entity.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.Map;

public class Order {

    private long id;
    private LocalDateTime orderDate;
    private Map<Long, Integer> orderList;
    private Map<OrderStatus, LocalDateTime> status;

    public Order() {
        this(-1);
    }

    public Order(long id) {
        this(id, null);
    }

    public Order(long id, LocalDateTime orderDate) {
        this(id, orderDate, null);
    }

    public Order(long id, LocalDateTime orderDate, Map<Long, Integer> orderList) {
        this(id, orderDate, orderList, null);
    }

    public Order(long id,
                 LocalDateTime orderDate,
                 Map<Long, Integer> orderList,
                 Map<OrderStatus, LocalDateTime> status) {
        this.id = id;
        this.orderDate = orderDate;
        this.orderList = orderList;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public Map<Long, Integer> getOrderList() {
        return orderList;
    }

    public void setOrderList(Map<Long, Integer> orderList) {
        this.orderList = orderList;
    }

    public Map<OrderStatus, LocalDateTime> getStatus() {
        return status;
    }

    public void setStatus(Map<OrderStatus, LocalDateTime> status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String delimiter = "\n\t";
        final StringBuilder sb = new StringBuilder(
                this.getClass().getSimpleName().concat(" {")
        );
        sb.append(delimiter).append("id: ").append(this.getId()).append(',');
        sb.append(delimiter).append("orderDate: ").append(this.getOrderDate()).append(',');
        sb.append(delimiter).append("orderList: ").append(this.getOrderList()).append(',');
        sb.append(delimiter).append("status: ").append(this.getStatus());
        return sb.append("\n}").toString();
    }

    @Override
    public int hashCode() {
        final int prime = 113;
        int result = 1;

        result = (int) ((result * prime) + (id ^ (id >>> 32)));
        result = (result * prime) + orderDate.hashCode();
        result = (result * prime) + orderList.hashCode();
        result = (result + prime) + status.hashCode();

        return result;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }

        Order that = (Order) o;

        if (this.id != that.getId()) return false;
        if (!this.orderDate.equals(that.orderDate)) return false;
        if (!this.orderList.equals(that.orderList)) return false;
        return (this.status.equals(that.getStatus()));
    }

}
