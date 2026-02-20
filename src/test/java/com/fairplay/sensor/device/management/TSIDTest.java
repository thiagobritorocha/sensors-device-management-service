package com.fairplay.sensor.device.management;

import com.fairplay.sensor.device.management.common.IdGenerator;
import io.hypersistence.tsid.TSID;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

class TSIDTest {

    @Test
    void shouldGenerateTSID() {

        TSID tsid1 = TSID.fast();
        System.out.println(tsid1);
        System.out.println(tsid1.toLong());
        System.out.println(tsid1.getInstant());


        TSID tsid2 = TSID.Factory.getTsid();
        System.out.println(tsid2);

        System.setProperty("tsid.node", "2");
        System.setProperty("tsid.node.count", "32");

        TSID.Factory factory = TSID.Factory.builder().build();
        TSID tsid3 = factory.generate();
        System.out.println(tsid3);

        TSID tsid4 = IdGenerator.generateTSID();
        System.out.println(tsid4);
        Assertions.assertThat(tsid4.getInstant()).isCloseTo(Instant.now(), Assertions.within(1, ChronoUnit.MINUTES));
    }
}
