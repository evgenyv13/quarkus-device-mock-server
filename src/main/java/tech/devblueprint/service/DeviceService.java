package tech.devblueprint.service;

import jakarta.enterprise.context.ApplicationScoped;
import tech.devblueprint.dto.DeviceDTO;

import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

@ApplicationScoped
public class DeviceService {

    private static final List<String> OS_TYPES = List.of("Android", "iOS", "Linux");

    public List<DeviceDTO> generateDevices(int amount) {
        return IntStream.range(0, amount)
                .mapToObj(i -> new DeviceDTO(
                        UUID.randomUUID(),
                        OS_TYPES.get((int) (Math.random() * OS_TYPES.size())),
                        "SN-" + UUID.randomUUID().toString().substring(0, 8)
                ))
                .toList();
    }
}