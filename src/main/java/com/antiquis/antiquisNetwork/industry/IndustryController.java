package com.antiquis.antiquisNetwork.industry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/industry")
public class IndustryController {
    @Autowired
    private IndustryService industryService;

    @PostMapping("/add")
    public void addIndustry(@RequestBody Industry industry) {
        industryService.addIndustry(industry);
    }

    @RequestMapping("/delete/{id}")
    public void deleteIndustryById(@PathVariable Long id) {
        industryService.deleteById(id);
    }

    @GetMapping("/getAll")
    public List<Industry> getAllIndustry() {
        return industryService.getAllIndustries();
    }
}
