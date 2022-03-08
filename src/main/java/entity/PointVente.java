package entity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class PointVente {
    @Id
    private String id_pointvente;
    private String nom;
}
