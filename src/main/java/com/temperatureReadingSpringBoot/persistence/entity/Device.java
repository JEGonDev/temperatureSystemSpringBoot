package com.temperatureReadingSpringBoot.persistence.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "device")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "device_id")
    private Integer id;

    @Column(name = "device_name")
    private String deviceName;

    @Column(name = "location")
    private String location;

    // Relationship with Sensor (One Device has Many Sensors)
    @OneToMany(mappedBy = "device", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Sensor> sensors;

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<Sensor> getSensors() {
        return sensors;
    }

    public void setSensors(List<Sensor> sensors) {
        this.sensors = sensors;
    }
}