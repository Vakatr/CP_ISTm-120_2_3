package com.tms.myapp.domain;

import org.hibernate.validator.constraints.Length;
import javax.persistence.*;

@Entity
@Table(name = "storagesData")
public class StoragesData {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Length(max = 255,  message = "Длинный артикул!")
  @Column(name = "sku")
  private String sku;

  private long quantity;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "idStorage")
  private Storages idStorage;

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

  public Storages getIdStorage() {
    return idStorage;
  }

  public void setIdStorage(Storages idStorage) {
    this.idStorage = idStorage;
  }
}
