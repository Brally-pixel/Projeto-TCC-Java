package com.jorgesoares.projetoTCC.repositories;

import com.jorgesoares.projetoTCC.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
