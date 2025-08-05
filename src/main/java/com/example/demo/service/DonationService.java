package com.example.demo.service;

import com.hei.tsinjo.model.Donation;
import com.hei.tsinjo.model.PaymentStatus;
import com.hei.tsinjo.repository.DonationRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DonationService {
  private final DonationRepository donationRepository;
  private final VolaService volaService;

  public DonationService(DonationRepository donationRepository, VolaService volaService) {
    this.donationRepository = donationRepository;
    this.volaService = volaService;
  }

  @Transactional
  public Donation processDonation(Donation donation) {
    donation.getPayment().setStatus(PaymentStatus.VERIFYING);
    Donation savedDonation = donationRepository.save(donation);
    verifyPaymentAsync(savedDonation.getId());
    return savedDonation;
  }

  @Async
  public void verifyPaymentAsync(String donationId) {
    // Async verification logic with Vola
  }
}
