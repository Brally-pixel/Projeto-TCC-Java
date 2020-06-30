package com.jorgesoares.projetotcc.repositories.empresa;

import com.jorgesoares.projetotcc.entity.DepartamentoRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<DepartamentoRequest, Integer> {

}
