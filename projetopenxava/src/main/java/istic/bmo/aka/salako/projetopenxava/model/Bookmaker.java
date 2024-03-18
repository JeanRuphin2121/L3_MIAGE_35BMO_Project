// Bookmaker.java
package istic.bmo.aka.salako.projetopenxava.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Data
public class Bookmaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Hidden
    private int id;

    @Column
    @Required
    private String bookmakerName;

    // Add other methods as needed
}
