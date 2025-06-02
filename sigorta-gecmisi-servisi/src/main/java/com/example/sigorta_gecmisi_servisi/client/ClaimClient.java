package com.example.sigorta_gecmisi_servisi.client;

import com.example.sigorta_gecmisi_servisi.model.dto.response.InsuranceClaimResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "insurance-claim-service", url = "http://localhost:8081")
public interface ClaimClient {

   @GetMapping("/api/claims/history/{historyId}")
   List<InsuranceClaimResponse> getClaimsByHistoryId(@PathVariable("historyId") Long historyId);
}
