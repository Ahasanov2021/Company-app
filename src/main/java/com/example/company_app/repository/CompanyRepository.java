package com.example.company_app.repository;

import com.example.company_app.model.Company;
import com.example.company_app.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
