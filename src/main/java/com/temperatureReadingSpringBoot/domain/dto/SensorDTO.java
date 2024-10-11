package com.temperatureReadingSpringBoot.domain.dto;

public class SensorDTO {

    private Integer id;
    private String model;
    private String type;
    private DeviceDTO device; // Relación muchos a uno con Device

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DeviceDTO getDevice() {
        return device;
    }

    public void setDevice(DeviceDTO device) {
        this.device = device;
    }
}
