package com.antiquis.antiquisNetwork.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public void addCompany(Company company) {
        companyRepository.save(company);
    }

    //Get all Company
    public List<Company> getAllCompanies() {
        List<Company> companies = new ArrayList<>();
        companyRepository.findAll().forEach(company -> companies.add(company));
        return companies;
    }

    //Company by id
    public Optional<Company> getCompanyByID(Long id) {
        Optional<Company> company = companyRepository.findById(id);
        return company;
    }

    //Find user by company
    public Company findCompanyByName(String name) {
        return companyRepository.findByCompanyName(name);
    }

    // TODO :Fix update users
    public void updateCompany(Long id, Company company) {
        companyRepository.save(company);
    }

    public void deleteById(Long id) {
        companyRepository.deleteById(id);
    }
}
