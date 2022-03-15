package com.example.demo.services;
import com.example.demo.entity.PointVente;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demo.repository.RepPointVente;

import java.util.List;

@AllArgsConstructor
@Service
public class Serpointvente {

    private final RepPointVente repPointVente;
    public List<PointVente> Getpointv() {
        return repPointVente.findAll();
    }

    public void Addpointv(PointVente p) {
        repPointVente.save(p);
    }

    public void Updatepointv(PointVente p) {
        PointVente p1=repPointVente.findById(p.getId_pointvente()).orElse(null);
        p1.setNom(p.getNom());
        repPointVente.save(p1);
    }

    public void deletepointv(String id) {
        repPointVente.deleteById(id);
    }
}
