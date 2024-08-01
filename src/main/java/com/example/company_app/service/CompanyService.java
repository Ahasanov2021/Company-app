package com.example.company_app.service;

import com.example.company_app.dto.CompanyDto;
import com.example.company_app.dto.CompanyRequest;

import java.util.List;

public interface CompanyService {

    void create(CompanyRequest companyRequest);

    List<CompanyDto> findAll();

    CompanyDto findById(Long id);


    void update(Long id, CompanyRequest companyRequest);


    void delete(Long id);
}
