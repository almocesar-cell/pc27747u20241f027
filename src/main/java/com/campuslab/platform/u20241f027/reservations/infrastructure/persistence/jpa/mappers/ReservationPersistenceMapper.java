package com.campuslab.platform.u20241f027.reservations.infrastructure.persistence.jpa.mappers;


import com.campuslab.platform.u20241f027.reservations.domain.model.aggregates.Reservation;
import com.campuslab.platform.u20241f027.reservations.domain.model.valueobjects.EquipmentBatch;
import com.campuslab.platform.u20241f027.reservations.domain.model.valueobjects.ReservationPeriod;
import com.campuslab.platform.u20241f027.reservations.infrastructure.persistence.jpa.Entities.ReservationPersistenceEntity;

@Component
    public class ReservationPersistenceMapper {

        public static Reservation toDomain(ReservationPersistenceEntity entity) {
            return new Reservation(
                    entity.getId(),
                    entity.getReservationCode(),
                    entity.getLaboratoryId(),
                    new ReservationPeriod(entity.getReservationStartDate(), entity.getReservationEndDate()),
                    new EquipmentBatch(entity.getEquipmentBatchCode(), entity.getEquipmentBatchQuantity()),
                    entity.getAccessLevel(),
                    entity.getStatus(),
                    entity.getReservationNotes()
            );
        }

        public static ReservationPersistenceEntity toEntity(Reservation reservation) {
            return ReservationPersistenceEntity.builder()
                    .reservationCode(reservation.getReservationCode())
                    .laboratoryId(reservation.getLaboratoryId())
                    .reservationStartDate(reservation.getReservationPeriod().startDate())
                    .reservationEndDate(reservation.getReservationPeriod().endDate())
                    .equipmentBatchCode(reservation.getEquipmentBatch().code())
                    .equipmentBatchQuantity(reservation.getEquipmentBatch().quantity())
                    .accessLevel(reservation.getAccessLevel())
                    .status(reservation.getStatus())
                    .reservationNotes(reservation.getReservationNotes())
                    .build();
        }
    }

