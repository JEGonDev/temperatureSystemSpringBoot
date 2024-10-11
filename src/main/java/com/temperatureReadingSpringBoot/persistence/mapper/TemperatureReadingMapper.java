package com.temperatureReadingSpringBoot.persistence.mapper;

import com.temperatureReadingSpringBoot.domain.dto.TemperatureReadingDTO;
import com.temperatureReadingSpringBoot.persistence.entity.TemperatureReading;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TemperatureReadingMapper {
    @Mappings({
            @Mapping(source = "id", target = "readingID"),
            @Mapping(source = "temperature", target = "temperature"),
            @Mapping(source = "readingTime", target = "readingTime"),
            @Mapping(source = "sensor", target = "sensor")
    })
    TemperatureReadingDTO toTemperatureReadingDTO(TemperatureReading temperatureReading);
    List<TemperatureReadingDTO> toTemperatureReadingDTOList(List<TemperatureReading> temperatureReadingList);

    @InheritInverseConfiguration
    TemperatureReading toTemperatureReading(TemperatureReadingDTO temperatureReadingDTO);
}
