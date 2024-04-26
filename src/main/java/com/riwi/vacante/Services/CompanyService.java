package com.riwi.vacante.Services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.riwi.vacante.Entities.Company;
import com.riwi.vacante.Repositories.CompanyRepository;
import com.riwi.vacante.Services.Interfaces.ICompanyService;
import com.riwi.vacante.Utils.Dto.Request.CompanyRequest;
import com.riwi.vacante.Utils.Dto.Response.CompanyResponse;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class CompanyService implements ICompanyService {

    @Autowired
    private final CompanyRepository companyRepository;
    @Override
    public Page<CompanyResponse> getAll(int page, int size) {
        // 1- Configuramos la paginacion
        
        if(page < 0)
        page = 0;
        PageRequest pagination = PageRequest.of(page, size);

        //2-Llamamos el Repository

        return this.companyRepository.findAll(pagination).map(company -> this.entityToResponse(company));
        // return this.companyRepository.findAll(pagination).map(this::entityToResponse); //Opcion corta
    }

    @Override
    public CompanyResponse create(CompanyRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public CompanyResponse update(CompanyRequest request, String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public CompanyResponse getByid(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getByid'");
    }

    //Este metodo se encargará de convertir una entidad en el Dto de respuesta de la entidad

    private CompanyResponse entityToResponse(Company entity){
        CompanyResponse response = new CompanyResponse();

        //BenasUtils nos permite hacer una copia de una clase en otra
        //En este caso toda la entidad de tipo Company sera copiada con la informacion requerida por CompanyResponse
        BeanUtils.copyProperties(entity, response);

        return response;

    }
    
}
