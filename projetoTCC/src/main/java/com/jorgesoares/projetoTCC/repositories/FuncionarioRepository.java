package com.jorgesoares.projetoTCC.repositories;

import com.jorgesoares.projetoTCC.domain.Empresa.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {



}
