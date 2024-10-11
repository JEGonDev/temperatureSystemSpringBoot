package com.temperatureReadingSpringBoot.domain.service;

import com.temperatureReadingSpringBoot.domain.repository.SensorDomainRepository;
import com.temperatureReadingSpringBoot.domain.dto.SensorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SensorService {
    @Autowired
    private SensorDomainRepository sensorDomainRepository;

    public SensorDTO save(SensorDTO sensorDTO) {
        return sensorDomainRepository.save(sensorDTO);
    }

    public Optional<SensorDTO> getSensorById(int id) {
        return sensorDomainRepository.getSensorById(id);
    }

    public boolean existsSensorById(int id) {
        return sensorDomainRepository.existsSensorById(id);
    }

    public List<SensorDTO> getAll() {
        return sensorDomainRepository.getAll();
    }

    public long countAll() {
        return sensorDomainRepository.countAll();
    }

    public boolean deleteSensorById(int id) {
        return getSensorById(id).map(sensorDTO -> {
            sensorDomainRepository.deleteById(id);
            return true;
        }).orElse(false);
    }
}
