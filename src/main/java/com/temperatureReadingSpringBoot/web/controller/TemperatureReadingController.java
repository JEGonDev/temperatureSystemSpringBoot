package com.temperatureReadingSpringBoot.web.controller;

import com.temperatureReadingSpringBoot.domain.dto.TemperatureReadingDTO;
import com.temperatureReadingSpringBoot.domain.service.TemperatureReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/readings")
public class TemperatureReadingController {
    @Autowired
    private TemperatureReadingService temperatureReadingService;

    @GetMapping("/getAll")
    public List<TemperatureReadingDTO> getAll() {
        return temperatureReadingService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<TemperatureReadingDTO> getTemperatureReadingById(@PathVariable("id") int id) {
        return temperatureReadingService.getTemperatureReadingById(id);
    }

    @GetMapping("/existsById/{id}")
    public boolean existsTemperatureReadingById(@PathVariable("id") int id) {
        return temperatureReadingService.existsTemperatureReadingById(id);
    }

    @GetMapping("/countAll")
    public long countAll() {
        return temperatureReadingService.countAll();
    }

    @PostMapping("/save")
    public TemperatureReadingDTO save(@RequestBody TemperatureReadingDTO temperatureReadingDTO) {
        return temperatureReadingService.save(temperatureReadingDTO);
    }

    @DeleteMapping("/deleteById/{id}")
    public boolean deleteTemperatureReadingById(@PathVariable("id") int id) {
        return temperatureReadingService.deleteTemperatureReadingById(id);
    }
}
