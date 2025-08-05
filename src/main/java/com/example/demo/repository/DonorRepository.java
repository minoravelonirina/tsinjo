package com.example.demo.repository;

@Repository
public interface DonorRepository extends JpaRepository<Donor, Long> {
  Optional<Donor> findByEmail(String email);
}
