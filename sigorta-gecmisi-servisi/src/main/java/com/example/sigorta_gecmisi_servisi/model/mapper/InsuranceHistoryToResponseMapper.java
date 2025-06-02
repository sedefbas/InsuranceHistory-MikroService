package com.example.sigorta_gecmisi_servisi.model.mapper;

import com.example.sigorta_gecmisi_servisi.model.InsuranceHistory;
import com.example.sigorta_gecmisi_servisi.model.dto.response.InsuranceHistoryResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface InsuranceHistoryToResponseMapper extends BaseMapper<InsuranceHistory, InsuranceHistoryResponse> {
}
