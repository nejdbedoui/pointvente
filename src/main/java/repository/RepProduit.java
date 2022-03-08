package repository;

import entity.Produit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepProduit extends MongoRepository<Produit,String> {
}
