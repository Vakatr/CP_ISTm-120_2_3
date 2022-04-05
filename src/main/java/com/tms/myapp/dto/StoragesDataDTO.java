package com.tms.myapp.dto;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.tms.myapp.domain.Storages;
import com.tms.myapp.domain.StoragesData;



@JsonAutoDetect
public class StoragesDataDTO {
    private Long id;
    private String sku;
    private Long quantity;
    private Storages idStorage;

    public StoragesData toStoragesData() {
        StoragesData storagesData = new StoragesData();
        storagesData.setId(id);
        storagesData.setIdStorage(idStorage);
        storagesData.setQuantity(quantity);
        storagesData.setSku(sku);
        return storagesData;
    }

    public static StoragesDataDTO fromNews(StoragesData storagesData) {
        StoragesDataDTO storagesDataDTO = new StoragesDataDTO();
        storagesDataDTO.setId(storagesData.getId());
        storagesDataDTO.setIdStorage(storagesData.getIdStorage());
        storagesDataDTO.setQuantity(storagesData.getQuantity());
        storagesDataDTO.setSku(storagesData.getSku());
        return storagesDataDTO;
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

    public Storages getIdStorage() {
        return idStorage;
    }

    public void setIdStorage(Storages idStorage) {
        this.idStorage = idStorage;
    }
}
