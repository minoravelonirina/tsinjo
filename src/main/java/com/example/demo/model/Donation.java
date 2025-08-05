package com.example.demo.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Donation {
  private String id;
  private Donor donor;
  private Payment payment;
  private String registrationDate;
}
