package com.temperatureReadingSpringBoot.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "temperature_reading")
public class TemperatureReading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reading_id")
    private Integer id;

    @Column(name = "temperature")
    private Double temperature;

    @Column(name = "reading_time")
    private String readingTime;

    // Relationship with Sensor (Many Readings belong to One Sensor)
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "sensor_id", nullable = false)
    private Sensor sensor;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
}
