package com.jorgesoares.projetotcc.repositories.empresa;

import com.jorgesoares.projetotcc.domain.empresa.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {

}
