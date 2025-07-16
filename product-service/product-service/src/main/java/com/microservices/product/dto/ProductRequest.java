package com.microservices.product.dto;

import lombok.*;

import java.math.BigDecimal;

public record ProductRequest(String name, String description, BigDecimal price) {
}