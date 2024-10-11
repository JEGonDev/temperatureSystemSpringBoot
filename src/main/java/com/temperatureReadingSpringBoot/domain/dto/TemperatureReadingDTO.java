package com.temperatureReadingSpringBoot.domain.dto;

public class TemperatureReadingDTO {

    private Integer readingID;
    private Double temperature;
    private String readingTime;
    private SensorDTO sensor; // Relación muchos a uno con Sensor

    // Getters y Setters
    public Integer getReadingID() {
        return readingID;
    }

    public void setReadingID(Integer readingID) {
        this.readingID = readingID;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public String getReadingTime() {
        return readingTime;
    }

    public void setReadingTime(String readingTime) {
        this.readingTime = readingTime;
    }

    public SensorDTO getSensor() {
        return sensor;
    }

    public void setSensor(SensorDTO sensor) {
        this.sensor = sensor;
    }
}
