package com.jorgesoares.projetotcc.repositories;

import com.jorgesoares.projetotcc.domain.empresa.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {

}
