package com.antiquis.antiquisNetwork.subIndustry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    //SubIndustry by id
    public Optional<SubIndustry> getSubIndustry(Long id) {
        Optional<SubIndustry> byId = subIndustryRepository.findById(id);
        return byId;
    }

    //Add SubIndustry
    public void addSubIndustrys(SubIndustry subIndustry) {
        subIndustryRepository.save(subIndustry);
    }

    // TODO :Fix update SubIndustrys
    public void updateSubIndustry(Long id, SubIndustry subIndustry) {
        subIndustryRepository.save(subIndustry);
    }

    public void deleteSubIndustry(Long id) {
        subIndustryRepository.deleteById(id);
    }
}
