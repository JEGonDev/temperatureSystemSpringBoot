package com.temperatureReadingSpringBoot.domain.repository;

import com.temperatureReadingSpringBoot.domain.dto.DeviceDTO;

import java.util.List;
import java.util.Optional;

public interface DeviceDomainRepository {
    DeviceDTO save(DeviceDTO deviceDTO);
    Optional<DeviceDTO> getDeviceById(int id);
    boolean existsDeviceById(int id);
    List<DeviceDTO> getAll();
    long countAll();
    void deleteById(int id);
}
