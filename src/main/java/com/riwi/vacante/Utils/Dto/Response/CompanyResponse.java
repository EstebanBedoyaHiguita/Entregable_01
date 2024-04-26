package com.riwi.vacante.Utils.Dto.Response;

import java.util.List;

import com.riwi.vacante.Entities.Vacant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class CompanyResponse {
    
    private String companyid;
    private String name;
    private String location;
    private String contact;
    private List<VacantResponse>Vacants;
}
