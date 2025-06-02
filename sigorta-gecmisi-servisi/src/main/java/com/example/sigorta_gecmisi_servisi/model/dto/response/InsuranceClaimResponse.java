package com.example.sigorta_gecmisi_servisi.dto.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class InsuranceClaimResponse {
    private Long id;
    private Double claimAmount;
    private String claimStatus;
    private LocalDateTime dateOfClaim;
}