package com.example.demo.repository;

import com.example.demo.entity.Commande;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepCommande extends MongoRepository<Commande,String> {
}
