package services;
import entity.Commande;
import entity.DetailsCommande;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import repository.RepCommande;
import repository.RepDetails;

import java.util.List;

@AllArgsConstructor
@Service
public class Serdetails {
    private final RepDetails repDetails;
    public List<DetailsCommande> Getdetails() {
        return repDetails.findAll();
    }

    public void Adddetails(DetailsCommande d) {
        repDetails.save(d);
    }

    public void Updatedetails(DetailsCommande d) {
        DetailsCommande d1=repDetails.findById(d.getId_details()).orElse(null);
        d1.setId_commande(d.getId_commande());
        d1.setId_produit(d.getId_produit());
        d1.setQuantite(d.getQuantite());
        repDetails.save(d1);
    }

    public void deletedetails(String id) {
        repDetails.deleteById(id);
    }
}
