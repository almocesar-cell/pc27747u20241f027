package com.campuslab.platform.u20241f027.reservations.domain.model.valueobjects;

public record EquipmentBatch(String code, Integer quantity) {

    public EquipmentBatch {
        if (code == null || code.isBlank()) {
            throw new IllegalArgumentException("Equipment batch code cannot be null or blank");
        }
        if (quantity == null || quantity <= 0) {
            throw new IllegalArgumentException("Equipment batch quantity must be greater than zero");
        }
    }
}

