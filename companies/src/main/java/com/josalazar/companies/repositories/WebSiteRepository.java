package com.josalazar.companies.repositories;

import com.josalazar.companies.model.Company;
import com.josalazar.companies.model.WebSite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebSiteRepository extends JpaRepository<WebSite, Long> {
}
