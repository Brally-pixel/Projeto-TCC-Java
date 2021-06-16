package br.com.chocolicia.projetotccjava.repository;

import br.com.chocolicia.projetotccjava.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
}
