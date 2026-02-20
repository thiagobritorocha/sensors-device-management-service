package com.fairplay.sensor.device.management.domain.repository;

import com.fairplay.sensor.device.management.domain.model.SensorId;
import com.fairplay.sensor.device.management.domain.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, SensorId>{
}
