package com.riwi.vacante.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riwi.vacante.Entities.Vacant;

public interface VacantRespository extends JpaRepository<Vacant, Long> {
    
}
