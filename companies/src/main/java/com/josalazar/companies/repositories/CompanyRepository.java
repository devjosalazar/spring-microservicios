package com.josalazar.companies.repositories;

import com.josalazar.companies.model.Company;
import com.josalazar.companies.model.WebSite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository <Company, Long>{

    Optional<Company> findByName(String name);
}
