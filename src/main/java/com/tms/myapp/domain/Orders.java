package com.tms.myapp.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "orders")
public class Orders {
  @Id
  private String number_order;
  @Length(max = 255,  message = "")
  @Column(name = "customer")
  private String customer;
  private String address;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
  private LocalDateTime date_of_created;
  private long status;
  @OneToMany(mappedBy = "id_number_order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Collection<OrdersData> orders_Data;


  public String getNumber_order() {
    return number_order;
  }

  public void setNumber_order(String number_order) {
    this.number_order = number_order;
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

  public LocalDateTime getDate_of_created() {
    return date_of_created;
  }

  public void setDate_of_created(LocalDateTime date_of_created) {
    this.date_of_created = date_of_created;
  }

  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  public Collection<OrdersData> getOrdersData() {
    return orders_Data;
  }

  public void setOrdersData(Collection<OrdersData> orders_Data) {
    this.orders_Data = orders_Data;
  }
}
