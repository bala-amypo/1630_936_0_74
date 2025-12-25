package com.example.demo.repository;

import java.util.*;
import com.example.demo.entity.Location;

public interface LocationRepository {
    Location save(Location l);
    Optional<Location> findById(Long id);
    List<Location> findAll();
}
