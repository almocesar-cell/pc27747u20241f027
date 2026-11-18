package com.campuslab.platform.u20241f027.reservations.domain.repositories;

import com.campuslab.platform.u20241f027.reservations.domain.model.aggregates.Reservation;

public interface ReservationRepository {
    Reservation save(Reservation reservation);
    boolean existsByBudgetIdentifier(Reservation laboratoryId);
}
