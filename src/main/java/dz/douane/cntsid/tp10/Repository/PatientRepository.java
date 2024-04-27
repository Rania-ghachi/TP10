package dz.douane.cntsid.tp10.Repository;

import dz.douane.cntsid.tp10.models.Patients;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository extends MongoRepository<Patients, ObjectId> {
    // des requêtes personnalisées peuvent être ajoutées ici
}