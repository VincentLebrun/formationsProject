package fr.afpa.formations.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "session_seq")
    @SequenceGenerator(name = "session_seq", initialValue = 1000, allocationSize = 1)
    private Long id;

    private String moduleList;
    private String internList;
    private String place;
    private Date startDate;
    private Date finishDate;
    @ManyToOne
    @JoinColumn(name="formations_id")
    private Formation formation;
    @OneToMany(mappedBy = "session" )
    private List<Student> students;
    @ManyToOne
    @JoinColumn(name = "form_module_id")
    private Module formModule;
}
