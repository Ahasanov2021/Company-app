package com.example.company_app.service;

import com.example.company_app.dto.CompanyDto;
import com.example.company_app.dto.CompanyRequest;
import com.example.company_app.mapper.CompanyMapper;
import com.example.company_app.model.Company;
import com.example.company_app.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;
    private final CompanyMapper companyMapper;

    @Override
    public void create(CompanyRequest companyRequest) {
        Optional<Company> byName = companyRepository.findByName(companyRequest.getName());
        if(byName.isPresent()){
            throw new RuntimeException();
        }
        Company company = companyMapper.requestToMarket(companyRequest);
        companyRepository.save(company);
    }

    @Override
    public List<CompanyDto> findAll() {
        return List.of();
    }

    @Override
    public CompanyDto findById(Long id) {
        return null;
    }

    @Override
    public void update(Long id, CompanyRequest companyRequest) {

    }

    @Override
    public void delete(Long id) {

    }
}
