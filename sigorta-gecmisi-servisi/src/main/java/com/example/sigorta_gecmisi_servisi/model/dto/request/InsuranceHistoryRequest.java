package com.example.sigorta_gecmisi_servisi.model.dto.request;

import lombok.Data;

@Data
public class InsuranceHistoryRequest {
    private Long insurancePolicyId;
    private Long userId;
}

