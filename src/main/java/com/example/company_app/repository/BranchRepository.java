package com.example.company_app.repository;

import com.example.company_app.model.Branch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface BranchRepository extends JpaRepository<Branch, Long>, JpaSpecificationExecutor<Branch> {

    @Query(value = "from Branch b join b.company c where c.id = :companyId and b.name = :name")
    Collection<Branch> findAllBranchesByName(Long companyId, String name);


    @Query(value = "select * from branch",
            countQuery = "SELECT COUNT(*) from branch",
            nativeQuery = true)
    Page<Branch> findAllCustom(Pageable pageable);
}
