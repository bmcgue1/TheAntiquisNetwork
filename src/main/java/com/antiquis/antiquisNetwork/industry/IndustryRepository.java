package com.antiquis.antiquisNetwork.industry;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IndustryRepository extends JpaRepository<Industry, Long> {
    Industry findByIndustryName(String name);
}
