package com.jorgesoares.projetotcc.repositories.cliente;

import com.jorgesoares.projetotcc.domain.cliente.CadastroCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroClienteRepository extends JpaRepository<CadastroCliente, Long> {
}
