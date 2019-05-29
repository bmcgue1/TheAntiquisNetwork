package com.antiquis.antiquisNetwork.industry;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    //Industry by id
    public Optional<Industry> getIndustry(Long id) {
        Optional<Industry> industry = industryRepository.findById(id);
        return industry;
    }

    //Find user by Industry
    public Industry findIndustryByName(String name) {
        return industryRepository.findByIndustryName(name);
    }

    // TODO :Fix update users
    public void updateIndustry(Long id, Industry industry) {
        industryRepository.save(industry);
    }

    public void deleteById(Long id) {
        industryRepository.deleteById(id);
    }
}
