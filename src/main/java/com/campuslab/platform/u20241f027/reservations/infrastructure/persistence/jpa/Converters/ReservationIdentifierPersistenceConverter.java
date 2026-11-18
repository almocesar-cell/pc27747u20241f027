package com.campuslab.platform.u20241f027.reservations.infrastructure.persistence.jpa.Converters;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.UUID;


@Converter(autoApply = false)
public class ReservationIdentifierPersistenceConverter  implements AttributeConverter<ReservationIdentifier, String> {
    @Override
    public String convertToDatabaseColumn(ReservationIdentifier attribute) {
        return attribute == null ? null : attribute.value().toString();
    }

    @Override
    public ReservationIdentifier convertToEntityAttribute(String dbData) {
        return dbData == null ? null : new ReservationIdentifier(UUID.fromString(dbData));
    }
}
