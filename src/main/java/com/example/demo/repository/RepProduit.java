package com.example.demo.repository;

import com.example.demo.entity.Produit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepProduit extends MongoRepository<Produit,String> {
}
