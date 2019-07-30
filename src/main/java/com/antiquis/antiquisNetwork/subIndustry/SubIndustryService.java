package com.antiquis.antiquisNetwork.subIndustry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubIndustryService {
    @Autowired
    private SubIndustryRepository subIndustryRepository;

    //Get all SubIndustrys
    public List<SubIndustry> getAllSubIndustrys() {
        List<SubIndustry> subIndustries = new ArrayList<>();
        subIndustryRepository.findAll().forEach(subIndustrys -> subIndustries.add(subIndustrys));
        return subIndustries;
    }

    //Add SubIndustry
    public void addSubindustries(SubIndustry subIndustry) {
        subIndustryRepository.save(subIndustry);
    }

    public void deleteSubIndustry(Long id) {
        subIndustryRepository.deleteById(id);
    }

}
