package com.jancy.iotbackend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "sensor_data")
public class SensorData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Double accX;

    @NotNull
    private Double accY;

    @NotNull
    private Double accZ;

    private Double gyroX;
    private Double gyroY;
    private Double gyroZ;

    @NotBlank
    private String status;

    private Long timestamp;

    public Long getId() { return id; }

    public Double getAccX() { return accX; }
    public void setAccX(Double accX) { this.accX = accX; }

    public Double getAccY() { return accY; }
    public void setAccY(Double accY) { this.accY = accY; }

    public Double getAccZ() { return accZ; }
    public void setAccZ(Double accZ) { this.accZ = accZ; }

    public Double getGyroX() { return gyroX; }
    public void setGyroX(Double gyroX) { this.gyroX = gyroX; }

    public Double getGyroY() { return gyroY; }
    public void setGyroY(Double gyroY) { this.gyroY = gyroY; }

    public Double getGyroZ() { return gyroZ; }
    public void setGyroZ(Double gyroZ) { this.gyroZ = gyroZ; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Long getTimestamp() { return timestamp; }
    public void setTimestamp(Long timestamp) { this.timestamp = timestamp; }
}