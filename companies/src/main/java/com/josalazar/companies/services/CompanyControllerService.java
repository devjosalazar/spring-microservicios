package com.josalazar.companies.services;

import com.josalazar.companies.model.Company;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface CompanyControllerService {

    @Operation(summary = "get company by name")
    @GetMapping(path = "{name}")
    ResponseEntity<Company> getCompanyByName(@PathVariable String name);

    @Operation(summary = "create company")
    @PostMapping(path = "create")
    ResponseEntity<Company> create(@RequestBody Company company);

    @Operation(summary = "update company")
    @PutMapping(path = "{name}")
    ResponseEntity<Company> update(@RequestBody Company company,
                                   @PathVariable String name);

    @Operation(summary = "delete company")
    @DeleteMapping(path = "{name}")
    ResponseEntity<?> delete(@PathVariable String name);
}
