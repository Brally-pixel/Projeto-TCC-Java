package com.jorgesoares.projetotcc.repositories.fornecedor;

import com.jorgesoares.projetotcc.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Provider, Long> {
}
