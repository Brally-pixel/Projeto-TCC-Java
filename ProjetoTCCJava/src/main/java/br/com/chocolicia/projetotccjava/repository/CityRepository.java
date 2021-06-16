package br.com.chocolicia.projetotccjava.repository;

import br.com.chocolicia.projetotccjava.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
