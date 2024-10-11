package com.temperatureReadingSpringBoot.persistence;

import com.temperatureReadingSpringBoot.domain.repository.SensorDomainRepository;
import com.temperatureReadingSpringBoot.domain.dto.SensorDTO;
import com.temperatureReadingSpringBoot.persistence.entity.Sensor;
import com.temperatureReadingSpringBoot.persistence.mapper.SensorMapper;
import com.temperatureReadingSpringBoot.persistence.crud.SensorCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SensorRepository implements SensorDomainRepository {
    @Autowired
    private SensorCrudRepository sensorCrudRepository;

    @Autowired
    private SensorMapper sensorMapper;

    @Override
    public SensorDTO save(SensorDTO sensorDTO) {
        Sensor sensor = sensorMapper.toSensor(sensorDTO);
        return sensorMapper.toSensorDTO(sensorCrudRepository.save(sensor));
    }

    @Override
    public Optional<SensorDTO> getSensorById(int id) {
        return sensorCrudRepository.findById(id).map(sensorMapper::toSensorDTO);
    }

    @Override
    public boolean existsSensorById(int id) {
        return sensorCrudRepository.existsById(id);
    }

    @Override
    public List<SensorDTO> getAll() {
        List<Sensor> sensors = (List<Sensor>) sensorCrudRepository.findAll();
        return sensorMapper.toSensorDTOList(sensors);
    }

    @Override
    public long countAll() {
        return sensorCrudRepository.count();
    }

    @Override
    public void deleteById(int id) {
        sensorCrudRepository.deleteById(id);
    }
}
