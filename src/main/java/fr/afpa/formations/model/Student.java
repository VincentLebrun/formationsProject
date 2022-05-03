package fr.afpa.formations.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    @SequenceGenerator(name = "student_seq", initialValue = 1000, allocationSize = 1)
    @Column(name = "student_id")
    private Long id;

    private String name;
    private String surname;
    private Date birthDate;
    public String mail;
    public Date startDate;
    @ManyToOne
    @JoinColumn(name="session_id")
    private Session session;
}
