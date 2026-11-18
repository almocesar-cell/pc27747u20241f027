package com.campuslab.platform.u20241f027.reservations.domain.model.valueobjects;

import java.time.LocalDate;

public record ReservationPeriod(LocalDate startDate, LocalDate endDate) {

    public ReservationPeriod {
        if (startDate == null) {
            throw new IllegalArgumentException("Start date cannot be null");
        }
        if (endDate == null) {
            throw new IllegalArgumentException("End date cannot be null");
        }
        if (endDate.isBefore(startDate)) {
            throw new IllegalArgumentException("End date cannot be before start date");
        }
    }
}
