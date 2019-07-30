package com.antiquis.antiquisNetwork.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.antiquis.antiquisNetwork.Common.CommonConstants.UPLOAD_DIR;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    //Add company
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

    //Uploads Images
    public void saveUploadFiles(MultipartFile file, Long id, Company company) throws IOException {
        byte[] bytes = file.getBytes();









        Path path = Paths.get(UPLOAD_DIR+"WE_UPLOADED" + file.getOriginalFilename());
        Files.write(path,bytes);

    }
}
