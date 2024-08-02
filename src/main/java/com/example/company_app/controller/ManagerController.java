package com.example.company_app.controller;

import com.example.company_app.dto.BranchRequest;
import com.example.company_app.dto.ManagerRequest;
import com.example.company_app.service.ManagerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/company/{companyId}/branch/{branchId}/manager")
@Valid
public class ManagerController {

    private final ManagerService managerService;

    @PostMapping
    public void create(@PathVariable Long companyId, @PathVariable Long branchId,
                       @RequestBody ManagerRequest managerRequest){
        managerService.create(companyId, branchId, managerRequest);
    }


}
