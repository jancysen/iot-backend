package com.jancy.iotbackend.service;

import com.jancy.iotbackend.entity.SensorData;
import com.jancy.iotbackend.repository.SensorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {

    private static final Logger logger = LoggerFactory.getLogger(SensorService.class);

    private final SensorRepository repository;

    public SensorService(SensorRepository repository) {
        this.repository = repository;
    }

    public SensorData saveData(SensorData data) {
        logger.info("Saving sensor data: {}", data);
        return repository.save(data);
    }

    public List<SensorData> getAllData() {
        return repository.findAll();
    }

    public List<SensorData> getAbnormalData() {
        return repository.findByStatus("abnormal");
    }
}