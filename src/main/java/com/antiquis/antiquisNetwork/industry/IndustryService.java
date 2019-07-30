package com.antiquis.antiquisNetwork.industry;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IndustryService {

    @Autowired
    private IndustryRepository industryRepository;

    public void addIndustry(Industry industry) {
        industryRepository.save(industry);
    }

    //Get all Industry
    public List<Industry> getAllIndustries() {
        List<Industry> industries = new ArrayList<>();
        industryRepository.findAll().forEach(industry -> industries.add(industry));
        return industries;
    }

    public void deleteById(Long id) {
        industryRepository.deleteById(id);
    }
}
