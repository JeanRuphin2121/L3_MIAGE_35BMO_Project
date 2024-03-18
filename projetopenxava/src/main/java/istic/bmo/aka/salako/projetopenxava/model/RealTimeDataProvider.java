// RealTimeDataProvider.java
package istic.bmo.aka.salako.projetopenxava.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Data
public class RealTimeDataProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Hidden
    private int id;

    @Column
    @Required
    private String providerName;

    // Add other methods as needed
}
