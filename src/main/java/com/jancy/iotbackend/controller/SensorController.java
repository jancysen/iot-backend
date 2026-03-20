package com.jancy.iotbackend.controller;

import com.jancy.iotbackend.entity.SensorData;
import com.jancy.iotbackend.service.SensorService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import com.jancy.iotbackend.security.JwtUtil;
import java.util.List;

@RestController
@RequestMapping("/api/sensor")
public class SensorController {

    private final SensorService service;

    public SensorController(SensorService service) {
        this.service = service;
    }

    @PostMapping
public SensorData saveData(@RequestHeader("Authorization") String authHeader,
                           @Valid @RequestBody SensorData data) {

    String token = authHeader.replace("Bearer ", "");
    JwtUtil.validateToken(token);

    return service.saveData(data);
}

    @GetMapping
    public List<SensorData> getAllData() {
        return service.getAllData();
    }

    @GetMapping("/abnormal")
    public List<SensorData> getAbnormalData() {
        return service.getAbnormalData();
    }
}