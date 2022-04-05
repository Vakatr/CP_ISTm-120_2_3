package com.tms.myapp.dto;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.tms.myapp.domain.Storages;


@JsonAutoDetect
public class StoragesDTO {
    private Long id;
    private String title;
    private String address;


    public Storages toStorages() {
        Storages storages = new Storages();
        storages.setId(id);
        storages.setTitle(title);
        storages.setAddress(address);
        return storages;
    }

    public static StoragesDTO fromStoragesDTO(Storages storages) {
        StoragesDTO storagesDTO = new StoragesDTO();
        storagesDTO.setId(storages.getId());
        storagesDTO.setTitle(storages.getTitle());
        storagesDTO.setAddress(storages.getAddress());
        return storagesDTO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
