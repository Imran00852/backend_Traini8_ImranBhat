package com.Trani8.BackendAssignment.controller;

import com.Trani8.BackendAssignment.model.TrainingCenter;
import com.Trani8.BackendAssignment.service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {

    @Autowired
    private TrainingCenterService trainingCenterService;

    @PostMapping("/new")
    public ResponseEntity<?> saveTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
        TrainingCenter savedCenter = trainingCenterService.saveTrainingCenter(trainingCenter);
        return ResponseEntity.ok(savedCenter);
    }
    @GetMapping()
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        List<TrainingCenter> allCenters = trainingCenterService.getAllTrainingCenters();
        return ResponseEntity.ok(allCenters.isEmpty() ? new ArrayList<>() : allCenters);
    }
}