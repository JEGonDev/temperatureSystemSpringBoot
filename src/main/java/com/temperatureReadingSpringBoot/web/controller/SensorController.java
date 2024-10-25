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

    @GetMapping("/getAll")
    public List<SensorDTO> getAll() {
        return sensorService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<SensorDTO> getSensorById(@PathVariable("id") int id) {
        return sensorService.getSensorById(id);
    }

    @GetMapping("/existsById/{id}")
    public boolean existsSensorById(@PathVariable("id") int id) {
        return sensorService.existsSensorById(id);
    }

    @GetMapping("/countAll")
    public long countAll() {
        return sensorService.countAll();
    }

    @PostMapping("/save")
    public SensorDTO save(@RequestBody SensorDTO sensorDTO) {
        return sensorService.save(sensorDTO);
    }

    @DeleteMapping("/deleteById/{id}")
    public boolean deleteSensorById(@PathVariable("id") int id) {
        return sensorService.deleteSensorById(id);
    }
}
