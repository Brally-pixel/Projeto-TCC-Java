package com.jorgesoares.projetotcc.repositories.empresa;

import com.jorgesoares.projetotcc.entity.PagamentoFuncionarioRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoFuncionarioRepository extends JpaRepository<PagamentoFuncionarioRequest, Long> {
}
