package com.antiquis.antiquisNetwork.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public void addCompany(Company company) {
        companyRepository.save(company);
    }

}
