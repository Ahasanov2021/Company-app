package com.example.company_app.service;

import com.example.company_app.dto.BranchRequest;
import com.example.company_app.mapper.BranchMapper;
import com.example.company_app.model.Branch;
import com.example.company_app.model.Company;
import com.example.company_app.repository.BranchRepository;
import com.example.company_app.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BranchServiceImpl implements BranchService {

    private final BranchRepository branchRepository;
    private final CompanyRepository companyRepository;
    private final BranchMapper branchMapper;

    @Override
    public void create(Long companyId, BranchRequest branchRequest) {
        Company company = companyRepository.findById(companyId).orElseThrow(()-> new RuntimeException());
        Branch branch = branchMapper.requestToBranch(branchRequest);
        branch.setCompany(company);

    }
}
