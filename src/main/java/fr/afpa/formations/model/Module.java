package fr.afpa.formations.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "module_seq")
    @SequenceGenerator(name = "module_seq", initialValue = 1000, allocationSize = 1)
    @Column(name="form_module_id")
    private Long id;

    private String discipline;
    private Timestamp startDiscipline;
    private Date startTime;
    private Date endTime;
    @OneToMany(mappedBy = "formModule")
    private List<Session> sessions;

}

