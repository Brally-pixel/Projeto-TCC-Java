package com.jorgesoares.projetotcc.repositories;

import com.jorgesoares.projetotcc.entity.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
