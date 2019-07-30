package com.antiquis.antiquisNetwork.subIndustry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subIndustry")
public class SubIndustryController {

    @Autowired
    private SubIndustryService subIndustryService;

    @PostMapping("/add")
    public void addSubIndustry(@RequestBody SubIndustry subIndustry) {
        subIndustryService.addSubindustries(subIndustry);
    }

    @RequestMapping("/delete/{id}")
    public void deleteSubIndustryBYId(@PathVariable Long id) {
        subIndustryService.deleteSubIndustry(id);
    }

    @GetMapping("/getAll")
    public List<SubIndustry> getAllSubIndustry() {
        return subIndustryService.getAllSubIndustrys();
    }
}