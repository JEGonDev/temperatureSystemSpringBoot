package com.temperatureReadingSpringBoot.domain.dto;

public class AlertDTO {

    private Integer alertID;
    private String message;
    private String creationTime; // Manteniendo como String según tu definición
    private SensorDTO sensor;     // Relación con Sensor

    // Getters y Setters
    public Integer getAlertID() {
        return alertID;
    }

    public void setAlertID(Integer alertID) {
        this.alertID = alertID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public SensorDTO getSensor() {
        return sensor;
    }

    public void setSensor(SensorDTO sensor) {
        this.sensor = sensor;
    }
}
