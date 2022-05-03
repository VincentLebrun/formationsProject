package fr.afpa.formations.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class ModuleFormation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "module_seq")
    @SequenceGenerator(name = "module_seq", initialValue = 1000, allocationSize = 1)
    private Long id;
    private String moduleList;
    private String internList;
    private String place;
    private Date finishDate;

}
add .
