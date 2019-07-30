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
    private long id;

    @Column(name = "companyName", unique = true, nullable = false)
    private String companyName;

    @Column(name = "description")
    private String description;

    @Column(name = "logo")
    private byte logo;

    @ManyToOne
    @JoinColumn(name = "industryId")
    private Industry industry;

    @OneToOne
    @JoinColumn(name = "networkId")
    private Network network;

    @Column(name = "image")
    private byte images;

    //TODO ADD: Company Logo
}
