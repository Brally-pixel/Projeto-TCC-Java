package br.com.chocolicia.projetotccjava.repository;

import br.com.chocolicia.projetotccjava.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
