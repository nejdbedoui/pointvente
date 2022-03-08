package entity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Produit {
    @Id
    private String id_produit;
    private String nomProduit;
}
