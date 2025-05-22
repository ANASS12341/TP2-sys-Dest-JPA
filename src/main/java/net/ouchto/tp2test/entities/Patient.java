package net.ouchto.tp2test.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date naissance;
    private boolean malade;
    private int score;
    @OneToMany(mappedBy ="patient" ,fetch=FetchType.LAZY)
    private Collection<RendezVous> rendezVous;

}
