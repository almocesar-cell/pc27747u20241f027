package com.campuslab.platform.u20241f027.reservations.infrastructure.persistence.jpa.Converters;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.UUID;


@Converter(autoApply = false)
public class LaboratoryIdPersistenceConverter implements AttributeConverter<LaboratoryId, String> {
    @Override
    public String convertToDatabaseColumn(LaboratoryId attribute) {
        return attribute == null ? null : attribute.value().toString();
    }

    @Override
    public LaboratoryId convertToEntityAttribute(String dbData) {
        return dbData == null ? null : new LaboratoryId(UUID.fromString(dbData));
    }
}
