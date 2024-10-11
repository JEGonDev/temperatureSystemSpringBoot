package com.temperatureReadingSpringBoot.persistence.crud;

import com.temperatureReadingSpringBoot.persistence.entity.TemperatureReading;
import org.springframework.data.repository.CrudRepository;

public interface TemperatureReadingCrudRepository extends CrudRepository<TemperatureReading, Integer> {
}
