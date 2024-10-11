package com.temperatureReadingSpringBoot.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "sensor")
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sensor_id")
    private Integer id;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "type", nullable = false)
    private String type;

    // Relationship with Device (Many Sensors belong to One Device)
    @ManyToOne
    @JoinColumn(name = "device_id", nullable = false)
    private Device device;

    // Getters and Setters
    public Integer getSensorId() {
        return id;
    }

    public void setSensorId(Integer sensorId) {
        this.id = sensorId;
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

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}
