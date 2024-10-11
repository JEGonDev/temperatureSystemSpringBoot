package com.temperatureReadingSpringBoot.persistence.mapper;

import com.temperatureReadingSpringBoot.domain.dto.AlertDTO;
import com.temperatureReadingSpringBoot.persistence.entity.Alert;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {SensorMapper.class})
public interface AlertMapper {
    @Mappings({
            @Mapping(source = "id", target = "alertID"),
            @Mapping(source = "message", target = "message"),
            @Mapping(source = "creationTime", target = "creationTime"),
            @Mapping(source = "sensor", target = "sensor")
    })
    AlertDTO toAlertDTO(Alert alert);
    List<AlertDTO> toAlertDTOList(List<Alert> alerts);

    @InheritInverseConfiguration
    Alert toAlert(AlertDTO alertDTO);
}
