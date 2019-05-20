package com.antiquis.antiquisNetwork.industry;

import com.antiquis.antiquisNetwork.company.Company;
import com.antiquis.antiquisNetwork.subIndustry.SubIndustry;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "industry")
public class Industry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "industryName", nullable = false)
    private String industryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "industry")
    @JsonIdentityInfo(
            generator = ObjectIdGenerators.PropertyGenerator.class,
            property = "id")
    private List<Company> companies = new ArrayList<>();

    @ManyToOne
    private SubIndustry subIndustry;


}
