package com.malli.customerservice.domain.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CustomerStatusResponse(String status, @JsonProperty("service_name") String serviceName, @JsonProperty("created_by") String createdBy) {
}
