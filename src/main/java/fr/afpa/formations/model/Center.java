package fr.afpa.formations.model;

//Import Lombok tools

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;
//ajouter dans les services et repo pas dans le model voyons



@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
@Entity
public class Center {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "center_seq")
    @SequenceGenerator(name = "center_seq", initialValue = 1000, allocationSize = 1)
    @Column(name="center_id")
    private Long id;

    private String name;
    private String address;
    private String form;
    @OneToMany(mappedBy = "center")
    private List<Formation> formations;

}
