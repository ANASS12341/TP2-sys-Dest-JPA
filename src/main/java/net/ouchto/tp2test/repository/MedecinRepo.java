package net.ouchto.tp2test.repository;

import net.ouchto.tp2test.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepo extends JpaRepository<Medecin, Long> {

    Medecin findByNom(String nom);
}
