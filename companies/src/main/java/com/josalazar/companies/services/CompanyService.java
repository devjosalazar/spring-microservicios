package com.josalazar.companies.services;

import com.josalazar.companies.model.Company;

public interface CompanyService {

    Company readByName(String name);
    Company create(Company company);
    Company update(Company company, String name);
    void delete(String name);
}
