package com.mongo.mongo.controller;

import com.mongo.mongo.entity.Company;
import com.mongo.mongo.service.CompanyServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/company")
public class CompanyController {
    private final CompanyServiceImpl companyService;

    @GetMapping()
    public ResponseEntity<List<Company>> getAllCompanies(){
        return ResponseEntity.ok(companyService.getCompanies());
    }
    @GetMapping("/{uuid}")
    public ResponseEntity<Company> getCompanyById(@PathVariable UUID uuid){
        return ResponseEntity.ok(companyService.getCompanyById(uuid));
    }
    @PostMapping ()
    public ResponseEntity<Company> addCompany(@RequestBody Company company){
        return ResponseEntity.ok(companyService.saveCompany(company));
    }
}
