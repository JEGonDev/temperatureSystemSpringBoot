package com.temperatureReadingSpringBoot.domain;

public class AlertDomain {
    private Integer id;
    private String message;
    private String creationTime;
    private SensorDomain sensor; // Relación muchos a uno
}
