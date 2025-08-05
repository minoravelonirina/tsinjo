package com.example.demo.repository;

@Repository
public interface AidRepository extends JpaRepository<Aid, Long> {
  List<Aid> findAll();
}
