package com.example.demo.repository;

import com.example.demo.entity.PointVente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepPointVente extends MongoRepository<PointVente,String> {
}
