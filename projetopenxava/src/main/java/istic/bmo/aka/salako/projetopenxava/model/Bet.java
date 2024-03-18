// Bet.java
package istic.bmo.aka.salako.projetopenxava.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Data
public class Bet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Hidden
    private int id;

    @ManyToOne
    private BetType betType;

    @Column
    @Required
    private java.math.BigDecimal betOdd;

    @Column
    @Required
    private float amount;
}
