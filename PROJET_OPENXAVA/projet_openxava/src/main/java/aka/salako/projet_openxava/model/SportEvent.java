package aka.salako.projet_openxava.model;

import java.util.*;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
public class SportEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String eventName;

    @Column
    private Date eventDateAndTime;

    @Column
    private String homeTeam;

    @Column
    private String awayTeam;

    // Getters and setters for id, eventName, eventDateAndTime, homeTeam, and awayTeam
    // ...

    public void addEvent() {
        // Implementation for addEvent method
    }

    public void updateOdds() {
        // Implementation for updateOdds method
    }
}
