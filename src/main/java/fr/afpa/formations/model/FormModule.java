package fr.afpa.formations.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FormModule {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "module_seq")
    @SequenceGenerator(name = "module_seq", initialValue = 1000, allocationSize = 1)
    private Long id;

    private String discipline;
    private Date startDiscipline;
    private Date startTime;
    private Date endTime;

}

