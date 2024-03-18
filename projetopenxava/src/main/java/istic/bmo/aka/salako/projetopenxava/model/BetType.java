// BetType.java
package istic.bmo.aka.salako.projetopenxava.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Data
public class BetType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Hidden
    private int id;

    @Column
    @Required
    private String typeName;

    @OneToMany(mappedBy = "betType")
    private List<Bet> bets;

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    // Add other methods as needed
}
