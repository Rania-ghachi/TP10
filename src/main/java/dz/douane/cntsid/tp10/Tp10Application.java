package dz.douane.cntsid.tp10;

import dz.douane.cntsid.tp10.Repository.PatientRepository;
import dz.douane.cntsid.tp10.models.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.util.List;

@SpringBootApplication
@Import(MongoConfig.class)
public class Tp10Application implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;
	public static void main(String[] args) {
		SpringApplication.run(Tp10Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Récupérer tous les enregistrements
		List<Patients> patients = patientRepository.findAll();

		// Afficher les objets dans la console
		for (Patients patient : patients) {
			System.out.println(patient);
		}
	}
}
