package com.temperatureReadingSpringBoot.domain;

public class TemperatureReadingDomain {
    private Integer id;
    private Double temperature;
    private String readingTime;
    private SensorDomain sensor; // Relación muchos a uno
}
