package com.example.demo.controller;
import com.example.demo.entity.PointVente;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.repository.RepPointVente;
import com.example.demo.services.Serpointvente;

import java.util.List;

@RestController
@RequestMapping(path="api/pointvente")
@AllArgsConstructor
public class Contpointvente {
    RepPointVente repPointVente;
    private final Serpointvente serpointvente;

    @Autowired
    public Contpointvente(Serpointvente serpointvente){
        this.serpointvente=serpointvente;
    }

    @GetMapping(value = "/Getpointv")
    @CrossOrigin(origins = "*")
    public List<PointVente> Getpointv(){
        return serpointvente.Getpointv();
    }

    @PostMapping(value = "/Addpointv")
    @CrossOrigin(origins = "*")
    public void Addpointv(PointVente p){
        serpointvente.Addpointv(p);
    }

    @PutMapping(value = "/Updatepointv")
    @CrossOrigin(origins = "*")
    public void Updatepointv(PointVente p){
        serpointvente.Updatepointv(p);
    }

    @DeleteMapping(value = "/deletepointv/{idp}")
    @CrossOrigin(origins = "*")
    public void deletepointv(@PathVariable("idp") String id) {
        serpointvente.deletepointv(id);
    }
}
