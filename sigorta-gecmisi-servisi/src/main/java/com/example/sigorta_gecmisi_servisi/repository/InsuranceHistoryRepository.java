package com.example.sigorta_gecmisi_servisi.repository;

import com.example.sigorta_gecmisi_servisi.model.entity.InsuranceHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceHistoryRepository extends JpaRepository<InsuranceHistoryEntity, Long> {
    // Additional query methods can be defined here if needed
}
