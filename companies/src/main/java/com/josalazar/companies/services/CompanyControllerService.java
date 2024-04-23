package com.josalazar.companies.services;

import com.josalazar.companies.model.Company;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface CompanyControllerService {

    @GetMapping(path = "{name}")
    ResponseEntity<Company> getCompanyByName(@PathVariable String name);

    @PostMapping(path = "create")
    ResponseEntity<Company> create(@RequestBody Company company);

    @PutMapping(path = "{name}")
    ResponseEntity<Company> update(@RequestBody Company company,
                                   @PathVariable String name);

    @DeleteMapping(path = "{name}")
    ResponseEntity<?> delete(@PathVariable String name);
}
