package com.example.demo.controller;

import com.example.demo.entity.Commande;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.repository.RepCommande;
import com.example.demo.services.Sercommande;

import java.util.List;

@RestController
@RequestMapping(path="api/commande")
@AllArgsConstructor
public class Contcommande {
    RepCommande repCommande;
    private final Sercommande sercommande;

    @Autowired
    public Contcommande(Sercommande sercommande){
        this.sercommande=sercommande;
    }
    @GetMapping(value = "/GetCommande")
    @CrossOrigin(origins = "*")
    public List<Commande> GetCommande(){
       // System.out.println(sercommande.GetCommande());
        return sercommande.GetCommande();

    }

    @PostMapping(value = "/AddCommande")
    @CrossOrigin(origins = "*")
    public void AddCommande(@RequestBody Commande c){
        sercommande.AddCommande(c);
        System.out.println(c);
    }

    @PutMapping(value = "/UpdateCommande")
    @CrossOrigin(origins = "*")
    public void UpdateCommande(@RequestBody Commande c){
        sercommande.UpdateCommande(c);
    }

    @DeleteMapping(value = "/deletecommande/{idc}")
    @CrossOrigin(origins = "*")
    public void deletecommande(@PathVariable("idc") String id) {
        sercommande.deletecommande(id);
    }
}
