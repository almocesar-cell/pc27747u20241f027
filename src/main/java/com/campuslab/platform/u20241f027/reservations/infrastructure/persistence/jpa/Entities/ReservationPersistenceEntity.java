package com.campuslab.platform.u20241f027.reservations.infrastructure.persistence.jpa.Entities;

import com.campuslab.platform.u20241f027.shared.infrastructure.jpa.entities.AuditableAbstractPersistenceEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "reservations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReservationPersistenceEntity extends AuditableAbstractPersistenceEntity {

    @Convert(converter = ReservationCodePersistenceConverter.class)
    @Column(name = "reservation_code", nullable = false, unique = true)
    private ReservationCode reservationCode;

    @Convert(converter = LaboratoryIdPersistenceConverter.class)
    @Column(name = "laboratory_id", nullable = false)
    private LaboratoryId laboratoryId;

    @Column(name = "reservation_start_date", nullable = false)
    private LocalDate reservationStartDate;

    @Column(name = "reservation_end_date", nullable = false)
    private LocalDate reservationEndDate;

    @Column(name = "equipment_batch_code", nullable = false)
    private String equipmentBatchCode;

    @Column(name = "equipment_batch_quantity", nullable = false)
    private Integer equipmentBatchQuantity;

    @Column(name = "access_level", nullable = false)
    private Integer accessLevel;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private ReservationStatus status;

    @Column(name = "reservation_notes")
    private String reservationNotes;
}