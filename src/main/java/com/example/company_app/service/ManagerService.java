package com.example.company_app.service;

import com.example.company_app.dto.ManagerRequest;

public interface ManagerService {
    void create(Long companyId, Long branchId, ManagerRequest managerRequest);
}
