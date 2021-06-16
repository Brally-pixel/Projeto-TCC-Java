package br.com.chocolicia.projetotccjava.repository;

import br.com.chocolicia.projetotccjava.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
