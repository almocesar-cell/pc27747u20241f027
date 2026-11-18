package com.campuslab.platform.u20241f027.reservations.infrastructure.persistence.jpa.adapters;


import org.springframework.stereotype.Component;

@Component
public class ReservationPersistenceAdapter implements ReservationRepository {

    private final ReservationJpaRepository repository;

    public ReservationPersistenceAdapter(ReservationJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Reservation save(Reservation reservation) {
        if (reservation == null) {
            return null;
        }
        var result = repository.save(ReservationPersistenceMapper.toEntity(reservation));
        return ReservationPersistenceMapper.toDomain(result);
    }

    @Override
    public boolean existsByReservationIdentifier(ReservationIdentifier reservationIdentifier) {
        return repository.existsByReservationIdentifier(reservationIdentifier);
    }
}

