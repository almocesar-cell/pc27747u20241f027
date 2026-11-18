package com.campuslab.platform.u20241f027.reservations.application.commands;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CreateReservationCommand(
        Long Id,
        LocalDate periodStartDate,
        LocalDate periodEndDate,
        BigDecimal allocatedAmountValue,
        String allocatedAmountCurrency,
        String status,
        String description
) {
}
