package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.*;
import com.example.demo.service.RouteOptimizationService;

import java.time.LocalDateTime;

public class RouteOptimizationServiceImpl implements RouteOptimizationService {

    private final ShipmentRepository shipRepo;
    private final RouteOptimizationResultRepository resRepo;

    public RouteOptimizationServiceImpl(ShipmentRepository s, RouteOptimizationResultRepository r) {
        this.shipRepo = s;
        this.resRepo = r;
    }

    @Override
    public RouteOptimizationResult optimizeRoute(Long shipmentId) {
        Shipment s = shipRepo.findById(shipmentId)
                .orElseThrow(() -> new ResourceNotFoundException("Shipment not found"));

        double distance = Math.hypot(
                s.getPickupLocation().getLatitude() - s.getDropLocation().getLatitude(),
                s.getPickupLocation().getLongitude() - s.getDropLocation().getLongitude()
        );

        RouteOptimizationResult r = RouteOptimizationResult.builder()
                .shipment(s)
                .optimizedDistanceKm(distance)
                .estimatedFuelUsageL(distance / s.getVehicle().getFuelEfficiency())
                .generatedAt(LocalDateTime.now())
                .build();

        return resRepo.save(r);
    }

    @Override
    public RouteOptimizationResult getResult(Long id) {
        return resRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Result not found"));
    }
}
