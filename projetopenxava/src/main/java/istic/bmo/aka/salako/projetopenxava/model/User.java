// User.java
package istic.bmo.aka.salako.projetopenxava.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Hidden
    private int id;

    @Column
    @Required
    private String lastName;

    @Column
    @Required
    private String firstName;

    @Column
    @Required
    private String email;

    @Column
    @Required
    private java.math.BigDecimal soldeJetons;

    @OneToMany(mappedBy = "user")
    @ReadOnly
    private List<Bet> bets;

    // Méthodes
    public void login(String email, String password) {
        // Implémentation de la logique de connexion
    }

    public void consulterPari() {
        // Implémentation de la logique de consultation des paris
    }

    public void consulterEvent() {
        // Implémentation de la logique de consultation des événements
    }

    public void placerPari() {
        // Implémentation de la logique de placement des paris
    }

    public void rechargerJetons() {
        // Implémentation de la logique de recharge des jetons
    }
}
