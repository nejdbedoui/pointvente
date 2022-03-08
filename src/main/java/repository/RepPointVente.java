package repository;

import entity.PointVente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepPointVente extends MongoRepository<PointVente,String> {
}
