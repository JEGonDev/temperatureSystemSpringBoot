package com.temperatureReadingSpringBoot.domain.repository;

import com.temperatureReadingSpringBoot.domain.dto.SensorDTO;

import java.util.List;
import java.util.Optional;

public interface SensorDomainRepository {
    SensorDTO save(SensorDTO sensorDTO);
    Optional<SensorDTO> getSensorById(int id);
    boolean existsSensorById(int id);
    List<SensorDTO> getAll();
    long countAll();
    void deleteById(int id);
}
