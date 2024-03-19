package aka.salako.projet_openxava.model;

import java.util.*;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
public class RealTimeDataProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Getters and setters for id

    public List<?> getEventData() {
		return null;
        // Implementation for getEventData method
    }
}
