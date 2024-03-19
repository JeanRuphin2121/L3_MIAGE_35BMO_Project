package aka.salako.projet_openxava.model;

import java.math.*;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String lastName;

    @Column
    private String firstName;

    @Column(unique = true)
    private String email;

    @Column
    private BigDecimal soldeJetons;

    // Getters and setters for id, lastName, firstName, email, and soldeJetons
    // ...

    public void login(String email, String password) {
        // Implementation for login method
    }

    public void consulterPari() {
        // Implementation for consulterPari method
    }

    public void consulterEvent() {
        // Implementation for consulterEvent method
    }

    public void placerPari() {
        // Implementation for placerPari method
    }

    public void rechargerJetons() {
        // Implementation for rechargerJetons method
    }
}
