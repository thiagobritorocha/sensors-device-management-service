package com.fairplay.sensor.device.management.api.config.web;

import io.hypersistence.tsid.TSID;
import jakarta.annotation.Nonnull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToTSIDWebConverter implements Converter<String, TSID> {

    @Override
    public TSID convert(@Nonnull String source) {
        return TSID.from(source);
    }
}
