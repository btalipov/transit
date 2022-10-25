package kz.talipov.transit.models.entities;

import kz.talipov.transit.models.enums.RequestStatus;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "requests")
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "route")
    private String route;

    @Column(name = "good_name")
    private String goodName;

    @ManyToOne
    private Hazard hazard;

    @Column(name = "amount")
    private Long amount;

    @ManyToOne
    private Currency currency;

    @ManyToOne
    private VehicleType vehicleType;

//    @Enumerated(value = EnumType.STRING)
    @Column(name = "status")
    private RequestStatus status;

    @Column(name = "price")
    private Long price;

    @ManyToOne
    private User user;

    @Column(name = "phone")
    private String phone;

//    @ManyToOne
//    @JoinColumn(name = "expeditor_id")
//    private User expeditor;

}