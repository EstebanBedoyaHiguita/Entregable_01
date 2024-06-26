package com.riwi.vacante.Utils.Dto.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder//Patron de diseño para crear clases
@AllArgsConstructor
@NoArgsConstructor

public class CompanyRequest {
    private String name;
    private String location;
    private String contact;
}
