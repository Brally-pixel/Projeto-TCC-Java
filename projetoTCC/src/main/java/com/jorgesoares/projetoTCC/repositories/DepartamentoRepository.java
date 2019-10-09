package com.jorgesoares.projetoTCC.repositories;

import com.jorgesoares.projetoTCC.domain.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {

}
