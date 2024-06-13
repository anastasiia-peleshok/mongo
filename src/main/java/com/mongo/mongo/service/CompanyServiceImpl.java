package com.mongo.mongo.service;

import com.mongo.mongo.entity.Company;
import com.mongo.mongo.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {


    private final CompanyRepository companyRepository;

    @Override
    public List<Company> getCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Company getCompanyById(UUID id) {
        return companyRepository.findById(id).orElseThrow(()->new NoSuchElementException("There is no company with id: "+id));
    }
}