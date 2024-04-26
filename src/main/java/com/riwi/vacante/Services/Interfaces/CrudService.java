package com.riwi.vacante.Services.Interfaces;

import org.springframework.data.domain.Page;

public interface CrudService <RQ, RS  ,ID> {

    Page<RS> getAll(int page, int size);

    RS create(RQ request);

    RS update (RQ request, ID id);

    void delete (ID id);

    RS getByid(ID id);
    
}
