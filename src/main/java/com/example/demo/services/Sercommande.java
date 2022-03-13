package com.example.demo.services;

import com.example.demo.entity.Commande;
import com.example.demo.repository.RepCommande;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class Sercommande {
    private final RepCommande repCommande;
    public List<Commande> GetCommande() {
        return repCommande.findAll();
    }

    public void AddCommande(Commande c) {
        repCommande.save(c);
    }

    public void UpdateCommande(Commande c) {
        Commande c1=repCommande.findById(c.getId_commande()).orElse(null);
        c1.setDate(c.getDate());
        c1.setNom_fournisseur(c.getNom_fournisseur());
        c1.setStatut(c.getStatut());
        c1.setType(c.getType());
        repCommande.save(c1);
    }

    public void deletecommande(String id) {
        repCommande.deleteById(id);
    }

}
