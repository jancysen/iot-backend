package com.jancy.iotbackend.repository;

import com.jancy.iotbackend.entity.SensorData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SensorRepository extends JpaRepository<SensorData, Long> {

    List<SensorData> findByStatus(String status);
}