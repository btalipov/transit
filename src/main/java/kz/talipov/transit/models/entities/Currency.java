package kz.talipov.transit.models.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "currencies")
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
}
