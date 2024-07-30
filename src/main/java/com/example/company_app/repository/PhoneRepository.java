package com.example.company_app.repository;

import com.example.company_app.model.Company;
import com.example.company_app.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
