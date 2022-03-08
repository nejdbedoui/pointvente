package entity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class DetailsCommande {
    @Id
    private String id_details;
    private String id_commande;
    private String id_produit;
    private int quantite;
}
