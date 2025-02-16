package tech.devblueprint.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import tech.devblueprint.dto.DeviceDTO;
import tech.devblueprint.service.DeviceService;

import java.util.List;

@Path("/devices")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DeviceResource {

    @Inject
    DeviceService deviceService;

    @GET
    public List<DeviceDTO> getDevices(@QueryParam("amount") @DefaultValue("5") int amount) {
        return deviceService.generateDevices(amount);
    }
}