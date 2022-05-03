package fr.afpa.formations.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "formation_seq")
    @SequenceGenerator(name = "formation_seq", initialValue = 1000, allocationSize = 1)
    private Long id;
    private String formationName;
    private String sessionList;
}
