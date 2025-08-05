package com.example.demo.endpoint.rest.controller.health;

import com.hei.tsinjo.model.Donation;
import com.hei.tsinjo.service.DonationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class TsinjoController {
  private final DonationService donationService;

  public TsinjoController(DonationService donationService) {
    this.donationService = donationService;
  }

  @GetMapping
  public String showAllDonations(Model model) {
    model.addAttribute("donations", donationService.getAllDonations());
    model.addAttribute("newDonation", new Donation());
    return "index";
  }

  @PostMapping("/donate")
  public String processDonation(@ModelAttribute Donation donation) {
    donationService.processDonation(donation);
    return "redirect:/";
  }
}
