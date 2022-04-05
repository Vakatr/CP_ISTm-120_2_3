package com.tms.myapp.dto;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tms.myapp.domain.OrdersData;



@JsonAutoDetect
public class OrdersDataDTO {
    private Long id;
    private String sku;
    private Long quantity;
    private Long weight;
    @JsonIgnore
    private OrdersDTO number_order;

    public OrdersData toOrdersData() {
        OrdersData ordersData = new OrdersData();
        ordersData.setId(id);
        ordersData.setQuantity(quantity);
        ordersData.setWeight(weight);
        ordersData.setSku(sku);
        ordersData.setId_number_order(number_order.toOrders());
        return ordersData;
    }

    public static OrdersDataDTO fromOrdersData(OrdersData ordersData) {
        OrdersDataDTO ordersDataDTO = new OrdersDataDTO();
        ordersDataDTO.setId(ordersData.getId());
        ordersDataDTO.setNumber_order(OrdersDTO.fromOrders(ordersData.getId_number_order()));
        ordersDataDTO.setSku(ordersData.getSku());
        ordersDataDTO.setQuantity(ordersData.getQuantity());
        ordersDataDTO.setWeight(ordersData.getWeight());
        return ordersDataDTO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public OrdersDTO getNumber_order() {
        return number_order;
    }

    public void setNumber_order(OrdersDTO number_order) {
        this.number_order = number_order;
    }
}
