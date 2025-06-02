package com.example.sigorta_gecmisi_servisi.dto.response;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class InsuranceHistoryResponse {
    private Long id;
    private Long insurancePolicyId;
    private Long userId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<InsuranceClaimResponse> claims = new ArrayList<>();
}