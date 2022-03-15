package com.example.demo.entity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class DetailsCommande {
    @Id
    private String id_details;
    private Produit produit;
    private int quantite;
}
