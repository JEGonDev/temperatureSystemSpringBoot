package com.temperatureReadingSpringBoot.domain;

public class SensorDomain {
    private Integer id;
    private String model;
    private String type;
    private DeviceDomain device; // Relación muchos a uno
}
