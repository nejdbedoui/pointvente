package com.example.demo.entity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class Commande {
    @Id
    private String id_commande;
    private Date date;
    private DetailsCommande[] liste_p;
    private String statut;
    private String type;
    private String nom_fournisseur;

}
