package com.example.sigorta_gecmisi_servisi.dto.request;

import lombok.Data;

@Data
public class InsuranceHistoryRequest {
    private Long insurancePolicyId;
    private Long userId;
}

