package kz.talipov.transit.models.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "hazards")
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Hazard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
}
