package com.campuslab.platform.u20241f027.reservations.domain.model.valueobjects;

import java.util.UUID;


public record LaboratoryId(UUID value) {

    public LaboratoryId {
        if (value == null) {
            throw new IllegalArgumentException("DepartmentId cannot be null");
        }
    }
}
