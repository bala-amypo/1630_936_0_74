package com.example.demo.repository;

import java.util.*;
import com.example.demo.entity.RouteOptimizationResult;

public interface RouteOptimizationResultRepository {
    RouteOptimizationResult save(RouteOptimizationResult r);
    Optional<RouteOptimizationResult> findById(Long id);
}
