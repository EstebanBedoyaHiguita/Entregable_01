package com.riwi.vacante.Entities;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "company")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(length = 40, nullable = false)
    private String name;
    @Column(length = 60, nullable = false)
    private String location;
    @Column(length = 15, nullable = false)
    private String contact;

    //Relacion
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "company", orphanRemoval = false) 
    // @MappeBy Debemos especificar donde o por que se esta mapeando-guardando En la otra entidad
    //Cascade.ALL -- Especificamos el tipo de cascad, all quiere decir que tendra datos
    //OrphalRemoval --- Se utiliza para especificar que un  objeto huerfano(Sin llave foranea) sera eliminado si es true
    @ToString.Exclude //Excluimos esta propiedad de ToString
    @EqualsAndHashCode.Exclude //Excluimos las  propiedades dentro de la lista
    private List<Vacant>Vacants;
    
}
