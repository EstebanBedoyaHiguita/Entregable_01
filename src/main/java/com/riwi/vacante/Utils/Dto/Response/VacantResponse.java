package com.riwi.vacante.Utils.Dto.Response;

import com.riwi.vacante.Entities.Company;
import com.riwi.vacante.Utils.enums.StatusVacant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class VacantResponse {
    
    private Long id;
    private String title;
    private String description;
    private StatusVacant status;
    private CompanyToVacantResponse company;
    
}
