package com.example.demo.repository;

import java.util.*;
import com.example.demo.entity.Vehicle;

public interface VehicleRepository {
    Vehicle save(Vehicle v);
    Optional<Vehicle> findById(Long id);
    Optional<Vehicle> findByVehicleNumber(String vehicleNumber);
    List<Vehicle> findByUserId(Long userId);
}
