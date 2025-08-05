package com.example.demo.endpoint.rest.controller;

@RestController
@RequestMapping("/donations")
public class DonationController {

  @Autowired private DonationService donationService;

  @PostMapping
  public ResponseEntity<Void> createDonation(@RequestBody DonationDto dto) {
    donationService.createDonationAndTriggerVerification(dto);
    return ResponseEntity.accepted().build();
  }

  @GetMapping
  public List<Donation> getAllPublicDonations() {
    return donationService.getValidatedDonations();
  }
}
