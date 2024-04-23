package com.josalazar.companies.controllers;

import com.josalazar.companies.model.Company;
import com.josalazar.companies.services.CompanyControllerService;
import com.josalazar.companies.services.CompanyService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@AllArgsConstructor
@RequestMapping(path = "company")
@Slf4j
public class CompanyController implements CompanyControllerService {

    private final CompanyService service;

    @Override
    public ResponseEntity<Company> getCompanyByName(String name) {
        log.info("Get: company {}", name);
        return ResponseEntity.ok(service.readByName(name));
    }

    @Override
    public ResponseEntity<Company> create(Company company) {
        log.info("Post: company {}",company.getName());
        return ResponseEntity.created(
                URI.create(service.create(company).getName()))
                .build();
    }

    @Override
    public ResponseEntity<Company> update(Company company, String name) {
        log.info("Put: company {}",company.getName());
        return ResponseEntity.ok(service.update(company, name));
    }

    @Override
    public ResponseEntity<?> delete(String name) {
        log.info("Delete: company {}", name);
        service.delete(name);
        return ResponseEntity.noContent().build();
    }
}
