package com.tms.myapp.dto;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tms.myapp.domain.Orders;


import java.time.LocalDateTime;



@JsonAutoDetect
public class OrdersDTO {
    private String number_order;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime date_of_created;
    private String customer;
    private String address;
    private Long status;



    public Orders toOrders() {
        Orders orders = new Orders();
        orders.setNumber_order(number_order);
        orders.setDate_of_created(date_of_created);
        orders.setCustomer(customer);
        orders.setAddress(address);
        orders.setStatus(status);
        return orders;
    }

    public static OrdersDTO fromOrders(Orders orders) {
        OrdersDTO ordersDTO = new OrdersDTO();
        ordersDTO.setNumber_order(orders.getNumber_order());
        ordersDTO.setDate_of_created(orders.getDate_of_created());
        ordersDTO.setCustomer(orders.getCustomer());
        ordersDTO.setAddress(orders.getAddress());
        ordersDTO.setStatus(orders.getStatus());
        return ordersDTO;
    }

    public String getNumber_order() {
        return number_order;
    }

    public void setNumber_order(String number_order) {
        this.number_order = number_order;
    }

    public LocalDateTime getDate_of_created() {
        return date_of_created;
    }

    public void setDate_of_created(LocalDateTime date_of_created) {
        this.date_of_created = date_of_created;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

}
