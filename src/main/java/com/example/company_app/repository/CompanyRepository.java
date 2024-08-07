package com.example.company_app.repository;

import com.example.company_app.model.Company;
import com.example.company_app.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company, Long>, JpaSpecificationExecutor<Company> {

    Optional<Company> findByName(String name);
}
