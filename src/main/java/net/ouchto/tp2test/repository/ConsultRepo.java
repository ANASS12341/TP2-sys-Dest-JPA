package net.ouchto.tp2test.repository;

import net.ouchto.tp2test.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultRepo extends JpaRepository<Consultation, Long> {
}
