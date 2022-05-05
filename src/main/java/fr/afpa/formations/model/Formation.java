package fr.afpa.formations.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "formation_seq")
    @SequenceGenerator(name = "formation_seq", initialValue = 1000, allocationSize = 1)
    @Column(name="formations_id")
    private Long id;
    private String formationName;
    private String sessionList;
    @ManyToOne
    @JoinColumn(name ="center_id")
    private Center center;
    @OneToMany(mappedBy = "formation" )
    private List<Session> sessions;
}
