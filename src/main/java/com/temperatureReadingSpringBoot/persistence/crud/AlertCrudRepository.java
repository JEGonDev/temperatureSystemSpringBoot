package com.temperatureReadingSpringBoot.persistence.crud;

import com.temperatureReadingSpringBoot.persistence.entity.Alert;
import org.springframework.data.repository.CrudRepository;

public interface AlertCrudRepository extends CrudRepository<Alert, Integer> {
}
