package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.*;
import com.example.demo.service.ShipmentService;

import java.time.LocalDate;

public class ShipmentServiceImpl implements ShipmentService {

    private final ShipmentRepository shipRepo;
    private final VehicleRepository vehicleRepo;
    private final LocationRepository locRepo;

    public ShipmentServiceImpl(ShipmentRepository s, VehicleRepository v, LocationRepository l) {
        this.shipRepo = s;
        this.vehicleRepo = v;
        this.locRepo = l;
    }

    @Override
    public Shipment createShipment(Long vehicleId, Shipment s) {
        Vehicle v = vehicleRepo.findById(vehicleId)
                .orElseThrow(() -> new ResourceNotFoundException("Vehicle not found"));

        if (s.getWeightKg() > v.getCapacityKg())
            throw new IllegalArgumentException("Weight exceeds capacity");

        if (s.getScheduledDate().isBefore(LocalDate.now()))
            throw new IllegalArgumentException("Scheduled date in past");

        Location p = locRepo.findById(s.getPickupLocation().getId()).orElseThrow();
        Location d = locRepo.findById(s.getDropLocation().getId()).orElseThrow();

        s.setVehicle(v);
        s.setPickupLocation(p);
        s.setDropLocation(d);

        return shipRepo.save(s);
    }

    @Override
    public Shipment getShipment(Long id) {
        return shipRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Shipment not found"));
    }
}
