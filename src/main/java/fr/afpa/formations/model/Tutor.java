package fr.afpa.formations.model;


import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tutor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tutor_seq")
    @SequenceGenerator(name = "tutor_seq", initialValue = 1000, allocationSize = 1)
    private Long id;
    private String name;
    private String surname;
    private Date birthDate;
    public String mail;
    public Date startDate;

}
