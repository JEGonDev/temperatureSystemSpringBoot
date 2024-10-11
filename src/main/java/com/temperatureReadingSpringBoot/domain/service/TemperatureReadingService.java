package com.temperatureReadingSpringBoot.domain.service;

import com.temperatureReadingSpringBoot.domain.repository.TemperatureReadingDomainRepository;
import com.temperatureReadingSpringBoot.domain.dto.TemperatureReadingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TemperatureReadingService {
    @Autowired
    private TemperatureReadingDomainRepository temperatureReadingDomainRepository;

    public TemperatureReadingDTO save(TemperatureReadingDTO temperatureReadingDTO) {
        return temperatureReadingDomainRepository.save(temperatureReadingDTO);
    }

    public Optional<TemperatureReadingDTO> getTemperatureReadingById(int id) {
        return temperatureReadingDomainRepository.getTemperatureReadingById(id);
    }

    public boolean existsTemperatureReadingById(int id) {
        return temperatureReadingDomainRepository.existsTemperatureReadingById(id);
    }

    public List<TemperatureReadingDTO> getAll() {
        return temperatureReadingDomainRepository.getAll();
    }

    public long countAll() {
        return temperatureReadingDomainRepository.countAll();
    }

    public boolean deleteTemperatureReadingById(int id) {
        return getTemperatureReadingById(id).map(temperatureReadingDTO -> {
            temperatureReadingDomainRepository.deleteById(id);
            return true;
        }).orElse(false);
    }
}
