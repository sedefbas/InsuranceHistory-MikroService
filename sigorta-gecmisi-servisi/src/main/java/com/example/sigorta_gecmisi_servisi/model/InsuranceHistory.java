package com.example.sigorta_gecmisi_servisi.model;


import com.example.sigorta_gecmisi_servisi.model.dto.response.InsuranceClaimResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsuranceHistory {

    private Long id;
    private Long insurancePolicyId;
    private Long userId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private List<InsuranceClaimResponse> claims = new ArrayList<>();

}

