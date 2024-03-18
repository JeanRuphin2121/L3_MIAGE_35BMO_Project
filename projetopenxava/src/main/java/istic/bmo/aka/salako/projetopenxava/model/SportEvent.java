// SportEvent.java
package istic.bmo.aka.salako.projetopenxava.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Data
public class SportEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Hidden
    private int id;

    @Column
    @Required
    private String eventName;

    @Column
    @Required
    private java.util.Date eventDateAndTime;

    @Column
    @Required
    private String homeTeam;

    @Column
    @Required
    private String awayTeam;

    @OneToMany(mappedBy = "sportEvent")
    @ReadOnly
    private List<Bet> bets;

    // Méthodes
    public void addEvent() {
        // Implémentation de la logique d'ajout d'événement
    }

    public void updateOdds() {
        // Implémentation de la logique de mise à jour des cotes
    }
}
