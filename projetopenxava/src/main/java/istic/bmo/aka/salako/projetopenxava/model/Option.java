// Option.java
package istic.bmo.aka.salako.projetopenxava.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Data
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Hidden
    private int id;

    @Column
    @Required
    private String optionName;

    @OneToMany(mappedBy = "option")
    @ReadOnly
    private List<Bet> bets;
}
