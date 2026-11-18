package com.campuslab.platform.u20241f027.reservations.domain.model.aggregates;

import com.campuslab.platform.u20241f027.reservations.domain.model.valueobjects.LaboratoryId;
import com.campuslab.platform.u20241f027.reservations.domain.model.valueobjects.ReservationCode;
import com.campuslab.platform.u20241f027.reservations.domain.model.valueobjects.ReservationPeriod;
import com.campuslab.platform.u20241f027.reservations.domain.model.valueobjects.ReservationStatus;

public class Reservation {
    private Long id;
    private ReservationCode reservationCode;
    private LaboratoryId laboratoryId;
    private ReservationPeriod reservationPeriod;
    private EquipmentBatch equipmentBatch;
    private Integer accessLevel;
    private ReservationStatus status;
    private String reservationNotes;

    public Reservation(LaboratoryId laboratoryId, ReservationPeriod reservationPeriod, EquipmentBatch equipmentBatch, Integer accessLevel, ReservationStatus status, String reservationNotes) {
        this.reservationCode = new ReservationCode();
        this.laboratoryId = laboratoryId;
        this.reservationPeriod = reservationPeriod;
        this.equipmentBatch = equipmentBatch;
        this.accessLevel = accessLevel;
        this.status = status == null ? ReservationStatus.PENDING : status;
        this.reservationNotes = reservationNotes;
    }

    public Reservation(Long id, ReservationCode reservationCode, LaboratoryId laboratoryId, ReservationPeriod reservationPeriod, EquipmentBatch equipmentBatch, Integer accessLevel, ReservationStatus status, String reservationNotes) {
        this.id = id;
        this.reservationCode = reservationCode;
        this.laboratoryId = laboratoryId;
        this.reservationPeriod = reservationPeriod;
        this.equipmentBatch = equipmentBatch;
        this.accessLevel = accessLevel;
        this.status = status == null ? ReservationStatus.PENDING : status;
        this.reservationNotes = reservationNotes;
    }

    public Long getId() {
        return id;
    }

    public ReservationCode getReservationCode() {
        return reservationCode;
    }

    public LaboratoryId getLaboratoryId() {
        return laboratoryId;
    }

    public ReservationPeriod getReservationPeriod() {
        return reservationPeriod;
    }

    public EquipmentBatch getEquipmentBatch() {
        return equipmentBatch;
    }

    public Integer getAccessLevel() {
        return accessLevel;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public String getReservationNotes() {
        return reservationNotes;
    }
}
