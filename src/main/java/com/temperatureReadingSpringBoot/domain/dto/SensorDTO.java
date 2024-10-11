package com.temperatureReadingSpringBoot.domain.dto;

public class SensorDTO {

    private Integer sensorID;
    private String model;
    private String type;
    private DeviceDTO device; // Relación muchos a uno con Device

    // Getters y Setters
    public Integer getSensorID() {
        return sensorID;
    }

    public void setSensorID(Integer sensorID) {
        this.sensorID = sensorID;
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
