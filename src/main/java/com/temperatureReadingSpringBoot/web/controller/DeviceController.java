package com.temperatureReadingSpringBoot.web.controller;

import com.temperatureReadingSpringBoot.domain.dto.DeviceDTO;
import com.temperatureReadingSpringBoot.domain.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/devices")
public class DeviceController {
    @Autowired
    private DeviceService deviceService;

    @PostMapping("/save")
    public DeviceDTO save(@RequestBody DeviceDTO deviceDTO) {
        return deviceService.save(deviceDTO);
    }

    @GetMapping("/getDeviceById/{id}")
    public Optional<DeviceDTO> getDeviceById(@PathVariable("id") int id) {
        return deviceService.getDeviceById(id);
    }

    @GetMapping("/existsDeviceById/{id}")
    public boolean existsDeviceById(@PathVariable("id") int id) {
        return deviceService.existsDeviceById(id);
    }

    @GetMapping("/getAllDevices")
    public List<DeviceDTO> getAll() {
        return deviceService.getAll();
    }

    @GetMapping("/countAllDevices")
    public long countAll() {
        return deviceService.countAll();
    }

    @DeleteMapping("/deleteDeviceById/{id}")
    public boolean deleteDeviceById(@PathVariable("id") int id) {
        return deviceService.deleteDeviceById(id);
    }
}
