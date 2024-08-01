package com.example.company_app.controller;

import com.example.company_app.dto.BranchRequest;
import com.example.company_app.dto.CompanyDto;
import com.example.company_app.dto.CompanyRequest;
import com.example.company_app.service.BranchService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/company/{companyId}/branch")
@Valid
public class BranchController {

    private final BranchService branchService;

    @PostMapping
    public void create(@PathVariable Long companyId, @RequestBody BranchRequest branchRequest){
        branchService.create(companyId, branchRequest);
    }


}
