package com.antiquis.antiquisNetwork.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("/add")
    public void addCompany(@RequestBody Company company) {
        companyService.addCompany(company);
    }

    @GetMapping("/getAll")
    public List<Company> getAllCompany() {
        return companyService.getAllCompanies();
    }

    @GetMapping("/{id}")
    public Optional<Company> getCompanyById(@PathVariable Long id) {
        return companyService.getCompanyByID(id);
    }

    @GetMapping("/name/{name}")
    public Company findCompanyByUserName(@PathVariable String name) {
        return companyService.findCompanyByName(name);
    }

    @RequestMapping("/delete/{id}")
    public void deleteCompany(@PathVariable Long id) {
        companyService.deleteById(id);
    }

    @PutMapping("upload/{id}")
    public void uploadFile(@RequestParam("file") MultipartFile file,@PathVariable Long id,Company company) throws  IOException{
       companyService.saveUploadFiles(file,id,company);
    }


}
