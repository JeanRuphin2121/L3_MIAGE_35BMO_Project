package aka.salako.projet_openxava.model;


import java.math.*;

import javax.persistence.*;

import lombok.*;
@Entity
@Data
public class Bet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String betType;

    @Column
    private BigDecimal betOdd;

    @Column
    private float amount;

    // Getters and setters for id, betType, betOdd, and amount
    // ...
}
