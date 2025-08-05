package com.example.demo.repository;

public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Long> {
  Optional<Beneficiary> findByEmail(String email);
}
