package com.josalazar.companies.services.impl;

import com.josalazar.companies.model.Company;
import com.josalazar.companies.model.eum.Category;
import com.josalazar.companies.repositories.CompanyRepository;
import com.josalazar.companies.services.CompanyService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Objects;

@Service
@Transactional
@Slf4j
@AllArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository repository;

    @Override
    public Company readByName(String name) {
        return repository.findByName(name)
                .orElseThrow(() -> new NoSuchElementException("Company not found"));
    }

    @Override
    public Company create(Company company) {
        validatedCategory(company);
        return repository.save(company);
    }

    @Override
    public Company update(Company company, String name) {
        Company companyUpdate = getCompany(name);
        companyUpdate.setLogo(company.getLogo());
        companyUpdate.setFoundationDate(company.getFoundationDate());
        companyUpdate.setFounder(company.getFounder());

        return repository.save(companyUpdate);
    }

    private Company getCompany(String name) {
        return repository.findByName(name)
                .orElseThrow(() -> new NoSuchElementException("Company not found"));
    }

    @Override
    public void delete(String name) {
        Company company = getCompany(name);
        repository.delete(company);
    }

    private static void validatedCategory(Company company) {
        company.getWebSites().forEach(webSite -> {
            if(Objects.isNull(webSite.getCategory())){
                webSite.setCategory(Category.NONE);
            }
        });
    }
}
