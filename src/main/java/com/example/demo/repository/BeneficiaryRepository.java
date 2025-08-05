package com.example.demo.repository;

@Repository
public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Long> {
  Optional<Beneficiary> findByEmail(String email);
}
