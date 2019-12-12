package com.jorgesoares.projetotcc.repositories.cliente;

import com.jorgesoares.projetotcc.domain.cliente.EnderecoCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoClienteRepository extends JpaRepository<EnderecoCliente, Long> {
}
