package com.example.company_app.dto;

import com.example.company_app.model.Branch;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDto {
    Long id;
    String address;
    String name;
    List<BranchDto> branches;
    List<PhoneDto> phones;
    ManagerDto manager;
}
