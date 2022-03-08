package repository;

import entity.Commande;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepCommande extends MongoRepository<Commande,String> {
}
