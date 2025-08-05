package com.example.demo.repository;

public interface AidRepository extends JpaRepository<Aid, Long> {
  List<Aid> findAll();
}
