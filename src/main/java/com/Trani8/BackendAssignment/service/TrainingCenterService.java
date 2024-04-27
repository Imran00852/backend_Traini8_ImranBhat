package com.Trani8.BackendAssignment.service;

import com.Trani8.BackendAssignment.model.TrainingCenter;
import com.Trani8.BackendAssignment.repository.TrainingCentersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class TrainingCenterService {

    @Autowired
    private TrainingCentersRepository repository;

    public TrainingCenter saveTrainingCenter(TrainingCenter trainingCenter){
            trainingCenter.setCreatedOn(Instant.now());
            return repository.save(trainingCenter);
    }
    public List<TrainingCenter> getAllTrainingCenters() {
        return repository.findAll();
    }
}
