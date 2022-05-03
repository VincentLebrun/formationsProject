package fr.afpa.formations.model;

//Import Lombok tools
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Center {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "center_seq")
    @SequenceGenerator(name = "center_seq", initialValue = 1000, allocationSize = 1)
    private Long id;
    private String name;
    private String address;
    private String listForm;
}
