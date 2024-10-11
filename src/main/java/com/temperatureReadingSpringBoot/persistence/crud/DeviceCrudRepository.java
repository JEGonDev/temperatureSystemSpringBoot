package com.temperatureReadingSpringBoot.persistence.crud;

import com.temperatureReadingSpringBoot.persistence.entity.Device;
import org.springframework.data.repository.CrudRepository;

public interface DeviceCrudRepository extends CrudRepository<Device, Integer> {
}
