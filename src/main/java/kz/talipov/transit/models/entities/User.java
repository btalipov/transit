package kz.talipov.transit.models.entities;

import kz.talipov.transit.models.enums.Role;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

//    @Enumerated(value = EnumType.STRING)
//    private Role role;


    @Column(name = "email", unique = true)
    private String email;


    @Column(name = "password")
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;
}