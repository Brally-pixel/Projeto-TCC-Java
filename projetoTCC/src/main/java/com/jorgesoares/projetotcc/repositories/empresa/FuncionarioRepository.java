package com.jorgesoares.projetotcc.repositories.empresa;

import com.jorgesoares.projetotcc.domain.empresa.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

}
