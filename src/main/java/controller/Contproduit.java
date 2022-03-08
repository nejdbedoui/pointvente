package controller;
import entity.PointVente;
import entity.Produit;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.RepCommande;
import services.Sercommande;
import services.Serproduit;

import java.util.List;


@RestController
@RequestMapping(path="api/produit")
@AllArgsConstructor
public class Contproduit {
    RepCommande repCommande;
    private final Serproduit serproduit;

    @Autowired
    public Contproduit(Serproduit serproduit){
        this.serproduit=serproduit;
    }

    @GetMapping(value = "/GetProduit")
    @CrossOrigin(origins = "*")
    public List<Produit> GetProduit(){
        return serproduit.GetProduit();
    }

    @PostMapping(value = "/AddProduit")
    @CrossOrigin(origins = "*")
    public void AddProduit(Produit p){
        serproduit.AddProduit(p);
    }

    @PutMapping(value = "/UpdateProduit")
    @CrossOrigin(origins = "*")
    public void UpdateProduit(Produit p){
        serproduit.UpdateProduit(p);
    }

    @DeleteMapping(value = "/deleteProduit/{idp}")
    @CrossOrigin(origins = "*")
    public void deleteProduit(@PathVariable("idp") String id) {
        serproduit.deleteProduit(id);
    }
}
