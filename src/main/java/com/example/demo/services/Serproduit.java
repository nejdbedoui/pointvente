package com.example.demo.services;
import com.example.demo.entity.Produit;
import com.example.demo.repository.RepProduit;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class Serproduit {
    private final RepProduit repProduit;
    public List<Produit> GetProduit() {
        return repProduit.findAll();
    }

    public void AddProduit(Produit p) {
        repProduit.save(p);
    }

    public void UpdateProduit(Produit p) {
        Produit p1=repProduit.findById(p.getId_produit()).orElse(null);
        p1.setNomProduit(p.getNomProduit());
        repProduit.save(p1);
    }

    public void deleteProduit(String id) {
        repProduit.deleteById(id);
    }
}
