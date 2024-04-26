package com.riwi.vacante.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.vacante.Entities.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, String> {
    
}
