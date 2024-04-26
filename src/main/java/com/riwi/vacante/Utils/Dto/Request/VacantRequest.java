package com.riwi.vacante.Utils.Dto.Request;

import com.riwi.vacante.Utils.enums.StatusVacant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class VacantRequest {

    private String title;
    private String description;
    private StatusVacant status;
    private String id;
    
}
