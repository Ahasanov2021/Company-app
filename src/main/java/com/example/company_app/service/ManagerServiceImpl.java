package com.example.company_app.service;

import com.example.company_app.dto.ManagerRequest;
import com.example.company_app.mapper.ManagerMapper;
import com.example.company_app.model.Company;
import com.example.company_app.model.Manager;
import com.example.company_app.repository.BranchRepository;
import com.example.company_app.repository.CompanyRepository;
import com.example.company_app.repository.ManagerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ManagerServiceImpl implements ManagerService {

    private final BranchRepository branchRepository;
    private final ManagerRepository managerRepository;
    private final ManagerMapper managerMapper;

    @Override
    public void create(Long companyId, Long branchId, ManagerRequest managerRequest) {
        var branch = branchRepository.findById(companyId).orElseThrow(()-> new RuntimeException());
        if(!branch.getCompany().getId().equals(companyId)){
            throw new RuntimeException();
        }
        Manager manager = managerMapper.requestToManager(managerRequest);
        branch.setManager(manager);
        branchRepository.save(branch);


    }
}
