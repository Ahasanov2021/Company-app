package com.example.company_app.service;

import com.example.company_app.dto.BranchRequest;
import com.example.company_app.model.Branch;
import com.example.company_app.repository.genericsearch.SearchCriteria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BranchService {

    void create(Long companyId, BranchRequest branchRequest);

    Page<Branch> searchByName(Long companyId, List<SearchCriteria> searchCriteria, Pageable pageable);
}
