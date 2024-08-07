package com.example.company_app.controller;

import com.example.company_app.dto.CompanyDto;
import com.example.company_app.dto.CompanyRequest;
import com.example.company_app.model.Branch;
import com.example.company_app.model.Company;
import com.example.company_app.repository.genericsearch.SearchCriteria;
import com.example.company_app.service.CompanyService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/company")
@Valid
public class CompanyController {

    private final CompanyService companyService;

    @PostMapping
    public void create(@RequestBody CompanyRequest companyRequest){
        companyService.create(companyRequest);
    }

    @PostMapping("/search")
    public Collection<Company> search(@RequestBody List<SearchCriteria> searchCriteria){
        return companyService.searchByName(searchCriteria);
    }

    @GetMapping
    public List<CompanyDto> getAll(){
        return companyService.findAll();
    }

    @GetMapping("/{id}")
    public CompanyDto findById(@PathVariable Long id){
        return companyService.findById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody CompanyRequest companyRequest){
        companyService.update(id, companyRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        companyService.delete(id);
    }

}
