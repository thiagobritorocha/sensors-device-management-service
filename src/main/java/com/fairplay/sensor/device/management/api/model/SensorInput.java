package com.fairplay.sensor.device.management.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SensorInput {
    private String name;
    private String ip;
    private String location;
    private String protocol;
    private String model;
}
