package tech.devblueprint.dto;

import java.util.UUID;

public class DeviceDTO {
    private UUID id;
    private String deviceOs;
    private String serial;

    public DeviceDTO(UUID id, String deviceOs, String serial) {
        this.id = id;
        this.deviceOs = deviceOs;
        this.serial = serial;
    }

    public UUID getId() {
        return id;
    }

    public String getDeviceOs() {
        return deviceOs;
    }

    public String getSerial() {
        return serial;
    }
}
