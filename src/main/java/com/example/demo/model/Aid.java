package com.example.demo.model;

@Entity
public class Aid {
  @Id @GeneratedValue private Long id;

  @ManyToOne private Beneficiary beneficiary;

  private LocalDateTime paymentDate;
  private Double amount;
  private String paymentMethod;
  private String accidentDescription;
}
