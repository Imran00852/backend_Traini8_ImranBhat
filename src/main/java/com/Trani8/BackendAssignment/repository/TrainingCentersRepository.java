package com.Trani8.BackendAssignment.repository;

import com.Trani8.BackendAssignment.model.TrainingCenter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrainingCentersRepository extends MongoRepository<TrainingCenter,String> {

}
