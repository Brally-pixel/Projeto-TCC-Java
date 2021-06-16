package br.com.chocolicia.projetotccjava.repository;

import br.com.chocolicia.projetotccjava.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
