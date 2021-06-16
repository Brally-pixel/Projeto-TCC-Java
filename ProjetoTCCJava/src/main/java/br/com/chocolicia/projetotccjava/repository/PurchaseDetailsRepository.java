package br.com.chocolicia.projetotccjava.repository;

import br.com.chocolicia.projetotccjava.entity.PurchaseDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseDetailsRepository extends JpaRepository<PurchaseDetails, Long> {
}
