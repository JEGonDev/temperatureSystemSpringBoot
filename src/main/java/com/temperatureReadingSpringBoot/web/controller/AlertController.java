package com.temperatureReadingSpringBoot.web.controller;

import com.temperatureReadingSpringBoot.domain.dto.AlertDTO;
import com.temperatureReadingSpringBoot.domain.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alerts")
public class AlertController {
    @Autowired
    private AlertService alertService;

    @GetMapping("/getAll")
    public List<AlertDTO> getAll() {
        return alertService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<AlertDTO> getAlertById(@PathVariable("id") int id) {
        return alertService.getAlertById(id);
    }

    @GetMapping("/existsById/{id}")
    public boolean existsAlertById(@PathVariable("id") int id){
        return alertService.existsAlertById(id);
    }

    @GetMapping("/countAll")
    public long countAll() {
        return alertService.countAll();
    }

    @PostMapping("/save")
    public AlertDTO save(@RequestBody AlertDTO alertDTO) {
        return alertService.save(alertDTO);
    }

    @DeleteMapping("/deleteById/{id}")
    public boolean deleteAlertById(@PathVariable("id") int id) {
        return alertService.deleteAlertById(id);
    }
}
