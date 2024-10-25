package com.temperatureReadingSpringBoot.persistence.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "alert")
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alert_id")
    private Integer id;

    @Column(name = "message", columnDefinition = "TEXT")
    private String message;

    @Column(name = "creation_time")
    private String creationTime;

    // Relationship with Sensor (Many Alerts belong to One Sensor)
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

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
}
