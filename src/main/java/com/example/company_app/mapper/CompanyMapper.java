package com.example.company_app.mapper;

import com.example.company_app.dto.CompanyDto;
import com.example.company_app.dto.CompanyRequest;
import com.example.company_app.model.Company;
import org.mapstruct.Mapper;

import static org.mapstruct.ReportingPolicy.IGNORE;

@Mapper(componentModel = "spring", unmappedTargetPolicy = IGNORE)
public interface CompanyMapper {

    Company requestToMarket(CompanyRequest companyRequest);

    CompanyDto companyToDto(Company company);
}
