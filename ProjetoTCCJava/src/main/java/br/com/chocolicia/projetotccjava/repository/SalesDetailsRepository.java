package br.com.chocolicia.projetotccjava.repository;

import br.com.chocolicia.projetotccjava.entity.SalesDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesDetailsRepository extends JpaRepository<SalesDetails, Long> {
}
