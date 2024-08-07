package com.example.company_app.service;

import com.example.company_app.dto.CompanyDto;
import com.example.company_app.dto.CompanyRequest;
import com.example.company_app.model.Company;
import com.example.company_app.repository.genericsearch.SearchCriteria;

import java.util.Collection;
import java.util.List;

public interface CompanyService {

    void create(CompanyRequest companyRequest);

    List<CompanyDto> findAll();

    CompanyDto findById(Long id);


    void update(Long id, CompanyRequest companyRequest);


    void delete(Long id);

    Collection<Company> searchByName(List<SearchCriteria> searchCriteria);
}
