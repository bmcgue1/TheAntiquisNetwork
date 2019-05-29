package com.antiquis.antiquisNetwork.network;

import com.antiquis.antiquisNetwork.company.Company;
import com.antiquis.antiquisNetwork.networkMembers.NetworkMember;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "network")
public class Network {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @OneToOne(mappedBy = "network")
    @JoinColumn(name = "Company")
    private Company company;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "network")
    @JsonIdentityInfo(
            generator = ObjectIdGenerators.PropertyGenerator.class,
            property = "id")
    private List<NetworkMember> networkMembers = new ArrayList<>();

}
