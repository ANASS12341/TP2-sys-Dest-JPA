package net.ouchto.tp2test.repository;

import net.ouchto.tp2test.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient, Long> {

    Patient findByNom(String nom);
}
