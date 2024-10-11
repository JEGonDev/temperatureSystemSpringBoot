package com.temperatureReadingSpringBoot.persistence.crud;

import com.temperatureReadingSpringBoot.persistence.entity.Sensor;
import org.springframework.data.repository.CrudRepository;

public interface SensorCrudRepository extends CrudRepository<Sensor, Integer> {
}
