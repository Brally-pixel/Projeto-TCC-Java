package com.jorgesoares.projetotcc.repositories;

import com.jorgesoares.projetotcc.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {



}
