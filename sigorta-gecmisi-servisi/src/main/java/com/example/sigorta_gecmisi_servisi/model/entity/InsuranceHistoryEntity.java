package com.example.sigorta_gecmisi_servisi.model.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
