package com.example.demo.repository;

import java.util.*;
import com.example.demo.entity.Shipment;

public interface ShipmentRepository {
    Shipment save(Shipment s);
    Optional<Shipment> findById(Long id);
    List<Shipment> findByVehicleId(Long vehicleId);
}
