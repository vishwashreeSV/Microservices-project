package com.microservices.inventory.inventory_service.dto;

public record InventoryResponse(String skuCode, boolean isInStock) {
}