package com.antiquis.antiquisNetwork.user;

import com.antiquis.antiquisNetwork.company.Company;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private long id;

    @Column(name = "userName", unique = true, nullable = false)
    private String userName;

    //Many Users can be apart of one company
    @ManyToOne
    @JsonIdentityInfo(
            generator = ObjectIdGenerators.PropertyGenerator.class,
            property = "id")
    @JoinColumn(name = "companyId")
    private Company company;


    @Column(name = "password", nullable = false)
    private String password;

    //TODO ADD: User Profile picture
}

