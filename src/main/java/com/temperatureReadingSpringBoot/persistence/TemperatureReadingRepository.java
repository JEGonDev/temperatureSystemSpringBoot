package com.temperatureReadingSpringBoot.persistence;

import com.temperatureReadingSpringBoot.domain.repository.TemperatureReadingDomainRepository;
import com.temperatureReadingSpringBoot.domain.dto.TemperatureReadingDTO;
import com.temperatureReadingSpringBoot.persistence.entity.TemperatureReading;
import com.temperatureReadingSpringBoot.persistence.mapper.TemperatureReadingMapper;
import com.temperatureReadingSpringBoot.persistence.crud.TemperatureReadingCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TemperatureReadingRepository implements TemperatureReadingDomainRepository {
    @Autowired
    private TemperatureReadingCrudRepository temperatureReadingCrudRepository;

    @Autowired
    private TemperatureReadingMapper temperatureReadingMapper;

    @Override
    public TemperatureReadingDTO save(TemperatureReadingDTO temperatureReadingDTO) {
        TemperatureReading temperatureReading = temperatureReadingMapper.toTemperatureReading(temperatureReadingDTO);
        return temperatureReadingMapper.toTemperatureReadingDTO(temperatureReadingCrudRepository.save(temperatureReading));
    }

    @Override
    public Optional<TemperatureReadingDTO> getTemperatureReadingById(int id) {
        return temperatureReadingCrudRepository.findById(id).map(temperatureReadingMapper::toTemperatureReadingDTO);
    }

    @Override
    public boolean existsTemperatureReadingById(int id) {
        return temperatureReadingCrudRepository.existsById(id);
    }

    @Override
    public List<TemperatureReadingDTO> getAll() {
        List<TemperatureReading> temperatureReadings = (List<TemperatureReading>) temperatureReadingCrudRepository.findAll();
        return temperatureReadingMapper.toTemperatureReadingDTOList(temperatureReadings);
    }

    @Override
    public long countAll() {
        return temperatureReadingCrudRepository.count();
    }

    @Override
    public void deleteById(int id) {
        temperatureReadingCrudRepository.deleteById(id);
    }
}
