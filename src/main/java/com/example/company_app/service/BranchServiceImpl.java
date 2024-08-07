package com.example.company_app.service;

import com.example.company_app.dto.BranchRequest;
import com.example.company_app.mapper.BranchMapper;
import com.example.company_app.model.Branch;
import com.example.company_app.model.Company;
import com.example.company_app.repository.BranchRepository;
import com.example.company_app.repository.CompanyRepository;
import com.example.company_app.repository.genericsearch.CustomSpecification;
import com.example.company_app.repository.genericsearch.SearchCriteria;
import jakarta.persistence.criteria.*;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

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
        company.getBranches().add(branch);
        branchRepository.save(branch);

    }

    @Override
    public Page<Branch> searchByName(Long companyId, List<SearchCriteria> searchCriteria, Pageable pageable) {
        List<SearchCriteria> newCriteria = searchCriteria.stream().filter(criteria -> !criteria.getKey().equals("name")).toList();
        CustomSpecification<Branch> customSpecification = new CustomSpecification<>(newCriteria);

        Specification<Branch>  companyIdSpec = new Specification<Branch>() {
            @Override
            public Predicate toPredicate(Root<Branch> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                Join<Branch, Company> companyBranches = root.join("company");
                return criteriaBuilder.equal(companyBranches.get("id"), companyId);
            }
        };
        return branchRepository.findAll(customSpecification.and(companyIdSpec), pageable);

    }
}
