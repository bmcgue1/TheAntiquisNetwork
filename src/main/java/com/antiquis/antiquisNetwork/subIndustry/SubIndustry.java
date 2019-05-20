package com.antiquis.antiquisNetwork.subIndustry;

import com.antiquis.antiquisNetwork.industry.Industry;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "subIndustry")
public class SubIndustry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "parentId", nullable = false)
    private Long parentId;

    @Column(name = "subIndustry")
    private String subIndustryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subIndustry")
    @JsonIdentityInfo(
            generator = ObjectIdGenerators.PropertyGenerator.class,
            property = "id")
    private List<Industry> industries;
}
