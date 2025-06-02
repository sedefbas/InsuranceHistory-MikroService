package com.example.sigorta_gecmisi_servisi.model.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "insurance_histories")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InsuranceHistoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long insurancePolicyId;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


}
