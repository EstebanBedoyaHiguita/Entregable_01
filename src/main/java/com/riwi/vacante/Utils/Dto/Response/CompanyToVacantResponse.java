package com.riwi.vacante.Utils.Dto.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class CompanyToVacantResponse {
    
    private String companyid;
    private String name;
    private String location;
    private String contact;
}
