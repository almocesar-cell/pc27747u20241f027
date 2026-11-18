package com.campuslab.platform.u20241f027.reservations.application.commandservices;

import com.campuslab.platform.u20241f027.reservations.application.commands.CreateReservationCommand;

public interface ReservationCommandService<Reservation> {
    Reservation handle(CreateReservationCommand command);
}
