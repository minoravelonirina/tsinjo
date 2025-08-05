package com.example.demo.model;

@Getter
@Setter
@Entity
public class Beneficiary {
  @Id @GeneratedValue private Long id;
  private String fullName;
  private String email;
}
