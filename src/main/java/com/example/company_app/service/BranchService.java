package com.example.company_app.service;

import com.example.company_app.dto.BranchRequest;

public interface BranchService {

    void create(Long companyId, BranchRequest branchRequest);

}
