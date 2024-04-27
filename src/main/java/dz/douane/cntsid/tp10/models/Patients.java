package dz.douane.cntsid.tp10.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "patients")
public class Patients {
    @Id
    private ObjectId id;

    private String nom;

    private String prenom;
    private String date;
    private String sexe;




    @Override
    public String toString() {
        return "Patients{" +
                "id=" + (id != null ? id.toString() : "") +
                ", nom='" + (nom != null ? nom : "") + '\'' +
                ", prenom='" + (prenom != null ? prenom : "") + '\'' +
                ", date=" + (date != null ? date.toString() : "") +
                ", sexe='" + (sexe != null ? sexe : "") + '\'' +
                // Autres propriétés à afficher
                '}';
    }

}