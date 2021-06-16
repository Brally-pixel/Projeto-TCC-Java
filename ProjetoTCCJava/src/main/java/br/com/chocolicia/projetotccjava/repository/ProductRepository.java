package br.com.chocolicia.projetotccjava.repository;

import br.com.chocolicia.projetotccjava.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
