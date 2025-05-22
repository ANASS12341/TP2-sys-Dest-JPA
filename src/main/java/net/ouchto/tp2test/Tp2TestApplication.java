package net.ouchto.tp2test;

import net.ouchto.tp2test.entities.Medecin;
import net.ouchto.tp2test.entities.Patient;
import net.ouchto.tp2test.entities.RendezVous;
import net.ouchto.tp2test.repository.ConsultRepo;
import net.ouchto.tp2test.repository.MedecinRepo;
import net.ouchto.tp2test.repository.PatientRepo;
import net.ouchto.tp2test.repository.RendezVousRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.Math.random;

@SpringBootApplication
public class Tp2TestApplication {

	public static void main(String[] args) {

		SpringApplication.run(Tp2TestApplication.class, args);
	}
@Bean
	CommandLineRunner start(PatientRepo patientRepo,
							ConsultRepo consultRepo,
							MedecinRepo medecinRepo,
							RendezVousRepo rendezVousRepo) {
		return args -> {
			Stream.of("ANASS","Khalid","Hassan")
					.forEach(name -> {
						Patient patient = new Patient();
						patient.setNom(name);
						patient.setNaissance(new Date());
						patient.setMalade(true);
						patient.setScore(8775);
						patientRepo.save(patient);

					});
			Stream.of("khaola","Khadija","Yassmine")
					.forEach(name -> {
						Medecin medecin = new Medecin();
						medecin.setNom(name);
						medecin.setEmail(name+"@gmail.com");
						medecin.setSpecialite(Math.random()>0.5?"Dentist":"Cardiologist");
						medecinRepo.save(medecin);
					});
			Patient patient = patientRepo.findById(1L).orElse(null);
			Patient patient2 = patientRepo.findByNom("Khalid");

			Medecin medecin = medecinRepo.findByNom("Khadija");

			RendezVous rendezVous = new RendezVous();
			rendezVous.setMedecin(medecin);
			rendezVous.setPatient(patient);
			rendezVous.setDate(new Date());
			rendezVousRepo.save(rendezVous);



		};
}
}
