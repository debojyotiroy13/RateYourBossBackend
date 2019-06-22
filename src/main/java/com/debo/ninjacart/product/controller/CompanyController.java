package com.debo.ninjacart.product.controller;

import com.debo.ninjacart.product.entity.Company;
import com.debo.ninjacart.product.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping(path = { "/"})
    public ResponseEntity<?> test() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @PostMapping(path = { "/company"})
    public ResponseEntity<?> createCompany(@RequestBody Company company) {
        companyService.addCompany(company);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping(path = { "/company/{id}"})
    public ResponseEntity<?> createCompany(@RequestParam("id") Long id) {
        Optional<Company> company = companyService.getCompanyById(id);
        return new ResponseEntity<>(company, HttpStatus.OK);
    }

    @GetMapping(path = { "/company"})
    public ResponseEntity<List<Company>> createCompany() {
        List<Company> companies = companyService.getAllCompany();
        return new ResponseEntity<List<Company>>(companies, HttpStatus.OK);
    }
}
