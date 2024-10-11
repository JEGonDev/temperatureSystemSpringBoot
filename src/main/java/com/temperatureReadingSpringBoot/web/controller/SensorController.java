package com.temperatureReadingSpringBoot.web.controller;

import com.temperatureReadingSpringBoot.domain.dto.SensorDTO;
import com.temperatureReadingSpringBoot.domain.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sensors")
public class SensorController {
    @Autowired
    private SensorService sensorService;

    @PostMapping("/save")
    public SensorDTO save(@RequestBody SensorDTO sensorDTO) {
        return sensorService.save(sensorDTO);
    }

    @GetMapping("/getSensorById/{id}")
    public Optional<SensorDTO> getSensorById(@PathVariable("id") int id) {
        return sensorService.getSensorById(id);
    }

    @GetMapping("/existsSensorById/{id}")
    public boolean existsSensorById(@PathVariable("id") int id) {
        return sensorService.existsSensorById(id);
    }

    @GetMapping("/getAllSensors")
    public List<SensorDTO> getAll() {
        return sensorService.getAll();
    }

    @GetMapping("/countAllSensors")
    public long countAll() {
        return sensorService.countAll();
    }

    @DeleteMapping("/deleteSensorById/{id}")
    public boolean deleteSensorById(@PathVariable("id") int id) {
        return sensorService.deleteSensorById(id);
    }
}
