package com.antiquis.antiquisNetwork.company;

import com.antiquis.antiquisNetwork.industry.Industry;
import com.antiquis.antiquisNetwork.network.Network;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "companyName",unique = true, nullable = false)
    private String companyName;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "industryId")
    private Industry industry;

    //TODO ADD: Company Logo

    @OneToOne
    @JoinColumn(name = "networkId")
    private Network network;
}
