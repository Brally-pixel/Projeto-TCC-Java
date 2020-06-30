package com.jorgesoares.projetotcc.repositories.cliente;

import com.jorgesoares.projetotcc.entity.GeneralAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoClienteRepository extends JpaRepository<GeneralAddress, Long> {
}
