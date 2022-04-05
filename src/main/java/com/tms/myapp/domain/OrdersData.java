package com.tms.myapp.domain;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity
@Table(name = "orders_Data")
public class OrdersData{
  public OrdersData(){}

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @Length(max = 255,  message = "Длинный артикул!")
  @Column(name = "sku")
  private String sku;
  private long quantity;
  private long weight;
  @Length(max = 10,  message = "Длинный артикул!")
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "id_number_order")
  private Orders id_number_order;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public long getQuantity() {
    return quantity;
  }

  public void setQuantity(long quantity) {
    this.quantity = quantity;
  }

  public long getWeight() {
    return weight;
  }

  public void setWeight(long weight) {
    this.weight = weight;
  }

  public Orders getId_number_order() {
    return id_number_order;
  }

  public void setId_number_order(Orders id_number_order) {
    this.id_number_order = id_number_order;
  }
}
