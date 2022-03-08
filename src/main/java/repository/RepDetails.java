package repository;

import entity.DetailsCommande;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepDetails extends MongoRepository<DetailsCommande,String> {
}
