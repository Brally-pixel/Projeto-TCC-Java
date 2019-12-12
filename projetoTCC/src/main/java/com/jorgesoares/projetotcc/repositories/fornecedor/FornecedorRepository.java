package com.jorgesoares.projetotcc.repositories.fornecedor;

import com.jorgesoares.projetotcc.domain.fornecedor.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}
