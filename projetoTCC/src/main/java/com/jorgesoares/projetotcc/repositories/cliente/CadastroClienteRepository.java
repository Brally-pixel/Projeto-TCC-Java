package com.jorgesoares.projetotcc.repositories.cliente;

import com.jorgesoares.projetotcc.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroClienteRepository extends JpaRepository<Client, Long> {
}
