package com.temperatureReadingSpringBoot.domain.dto;

public class DeviceDTO {

    private Integer deviceID;
    private String deviceName;
    private String location;

    // Getters y Setters
    public Integer getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(Integer deviceID) {
        this.deviceID = deviceID;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
