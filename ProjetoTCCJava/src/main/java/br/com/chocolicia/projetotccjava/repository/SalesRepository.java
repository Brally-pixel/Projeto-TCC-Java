package br.com.chocolicia.projetotccjava.repository;

import br.com.chocolicia.projetotccjava.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sales, Long> {
}
