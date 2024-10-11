package com.temperatureReadingSpringBoot.persistence.mapper;

import com.temperatureReadingSpringBoot.domain.dto.DeviceDTO;
import com.temperatureReadingSpringBoot.persistence.entity.Device;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DeviceMapper {
    @Mappings({
            @Mapping(source = "id", target = "deviceID"),
            @Mapping(source = "deviceName", target = "deviceName"),
            @Mapping(source = "location", target = "location")
    })
    DeviceDTO toDeviceDTO(Device device);
    List<DeviceDTO> toDeviceDTOList(List<Device> deviceList);

    @InheritInverseConfiguration
    @Mapping(target = "sensors", ignore = true)
    Device toDevice(DeviceDTO deviceDTO);
}
