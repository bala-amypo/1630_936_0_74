package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.*;
import com.example.demo.service.VehicleService;

import java.util.List;

public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepo;
    private final UserRepository userRepo;

    public VehicleServiceImpl(VehicleRepository v, UserRepository u) {
        this.vehicleRepo = v;
        this.userRepo = u;
    }

    @Override
    public Vehicle addVehicle(Long userId, Vehicle vehicle) {
        if (vehicle.getCapacityKg() <= 0)
            throw new IllegalArgumentException("Capacity must be positive");

        User u = userRepo.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));

        vehicle.setUser(u);
        return vehicleRepo.save(vehicle);
    }

    @Override
    public List<Vehicle> getVehiclesByUser(Long userId) {
        return vehicleRepo.findByUserId(userId);
    }

    @Override
    public Vehicle findById(Long id) {
        return vehicleRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Vehicle not found"));
    }
}
