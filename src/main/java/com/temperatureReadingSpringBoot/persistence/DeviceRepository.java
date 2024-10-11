package com.temperatureReadingSpringBoot.persistence;

import com.temperatureReadingSpringBoot.domain.repository.DeviceDomainRepository;
import com.temperatureReadingSpringBoot.domain.dto.DeviceDTO;
import com.temperatureReadingSpringBoot.persistence.entity.Device;
import com.temperatureReadingSpringBoot.persistence.mapper.DeviceMapper;
import com.temperatureReadingSpringBoot.persistence.crud.DeviceCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DeviceRepository implements DeviceDomainRepository {
    @Autowired
    private DeviceCrudRepository deviceCrudRepository;

    @Autowired
    private DeviceMapper deviceMapper;

    @Override
    public DeviceDTO save(DeviceDTO deviceDTO) {
        Device device = deviceMapper.toDevice(deviceDTO);
        return deviceMapper.toDeviceDTO(deviceCrudRepository.save(device));
    }

    @Override
    public Optional<DeviceDTO> getDeviceById(int id) {
        return deviceCrudRepository.findById(id).map(deviceMapper::toDeviceDTO);
    }

    @Override
    public boolean existsDeviceById(int id) {
        return deviceCrudRepository.existsById(id);
    }

    @Override
    public List<DeviceDTO> getAll() {
        List<Device> devices = (List<Device>) deviceCrudRepository.findAll();
        return deviceMapper.toDeviceDTOList(devices);
    }

    @Override
    public long countAll() {
        return deviceCrudRepository.count();
    }

    @Override
    public void deleteById(int id) {
        deviceCrudRepository.deleteById(id);
    }
}
