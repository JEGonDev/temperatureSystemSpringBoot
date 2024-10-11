package com.temperatureReadingSpringBoot.domain.repository;

import com.temperatureReadingSpringBoot.domain.dto.TemperatureReadingDTO;

import java.util.List;
import java.util.Optional;

public interface TemperatureReadingDomainRepository {
    TemperatureReadingDTO save(TemperatureReadingDTO temperatureReadingDTO);
    Optional<TemperatureReadingDTO> getTemperatureReadingById(int id);
    boolean existsTemperatureReadingById(int id);
    List<TemperatureReadingDTO> getAll();
    long countAll();
    void deleteById(int id);
}
