package com.antiquis.antiquisNetwork.company;

import com.antiquis.antiquisNetwork.industry.Industry;
import com.antiquis.antiquisNetwork.network.Network;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "companyName", unique = true, nullable = false)
    private String companyName;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "industryId")
    private Industry industry;

    @OneToOne
    @JoinColumn(name = "networkId")
    private Network network;

    //TODO ADD: Company Logo
}
