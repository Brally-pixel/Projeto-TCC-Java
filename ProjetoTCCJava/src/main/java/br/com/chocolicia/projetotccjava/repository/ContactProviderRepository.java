package br.com.chocolicia.projetotccjava.repository;

import br.com.chocolicia.projetotccjava.entity.ContactProvider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactProviderRepository extends JpaRepository<ContactProvider, Long> {
}
