package com.example.company_app.repository;

import com.example.company_app.model.Branch;
import com.example.company_app.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager, Long> {
}
