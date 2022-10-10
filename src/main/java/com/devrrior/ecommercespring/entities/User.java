package com.devrrior.ecommercespring.entities;

import com.devrrior.ecommercespring.constants.UserRoleEnum;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private String urlPicProfile;

    private UserRoleEnum role;

    private Date birthDate;

    @OneToMany(mappedBy = "user")
    private List<Address> addresses;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;

    @OneToMany(mappedBy = "user")
    @Column(nullable = false)
    private List<Product> products;

}
