package com.mongo.mongo.service;

import com.mongo.mongo.entity.Company;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CompanyService {
    List<Company> getCompanies();
    Company saveCompany(Company company);
    Company getCompanyById(UUID id);
}
