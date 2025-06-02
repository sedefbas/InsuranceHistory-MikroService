package com.example.sigorta_gecmisi_servisi.controller;

import com.example.sigorta_gecmisi_servisi.model.InsuranceHistory;
import com.example.sigorta_gecmisi_servisi.model.dto.request.InsuranceHistoryRequest;
import com.example.sigorta_gecmisi_servisi.model.dto.response.InsuranceHistoryResponse;
import com.example.sigorta_gecmisi_servisi.model.mapper.InsuranceHistoryToResponseMapper;
import com.example.sigorta_gecmisi_servisi.service.InsuranceHistoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/insurance-histories")
public class InsuranceHistoryController {

    private final InsuranceHistoryService insuranceHistoryService ;
    private final InsuranceHistoryToResponseMapper responseMapper ;

    public InsuranceHistoryController(InsuranceHistoryService insuranceHistoryService, InsuranceHistoryToResponseMapper responseMapper) {
        this.insuranceHistoryService = insuranceHistoryService;
        this.responseMapper = responseMapper;
    }

    @PostMapping
    public ResponseEntity<InsuranceHistoryResponse> create(@RequestBody InsuranceHistoryRequest request) {
        InsuranceHistory domain = insuranceHistoryService.create(request);
        InsuranceHistoryResponse response = responseMapper.map(domain);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InsuranceHistoryResponse> getById(@PathVariable Long id) {
        InsuranceHistory domain = insuranceHistoryService.getById(id);
        InsuranceHistoryResponse response = responseMapper.map(domain);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<InsuranceHistoryResponse>> getAll() {
        List<InsuranceHistory> domains = insuranceHistoryService.getAll();
        List<InsuranceHistoryResponse> responses = domains.stream()
                .map(responseMapper::map)
                .toList();
        return ResponseEntity.ok(responses);
    }

    @PutMapping("/{id}")
    public ResponseEntity<InsuranceHistoryResponse> update(@PathVariable Long id,
                                                           @RequestBody InsuranceHistoryRequest request) {
        InsuranceHistory domain = insuranceHistoryService.update(id, request);
        InsuranceHistoryResponse response = responseMapper.map(domain);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        insuranceHistoryService.delete(id);
        return ResponseEntity.noContent().build();
    }

}