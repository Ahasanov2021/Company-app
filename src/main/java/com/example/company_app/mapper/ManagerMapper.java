package com.example.company_app.mapper;

import com.example.company_app.dto.CompanyRequest;
import com.example.company_app.dto.ManagerRequest;
import com.example.company_app.model.Company;
import com.example.company_app.model.Manager;
import org.mapstruct.Mapper;

import static org.mapstruct.ReportingPolicy.IGNORE;

@Mapper(componentModel = "spring", unmappedTargetPolicy = IGNORE)
public interface ManagerMapper {

    Manager requestToManager(ManagerRequest managerRequest);
}
