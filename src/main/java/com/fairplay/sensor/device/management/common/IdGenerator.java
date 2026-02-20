package com.fairplay.sensor.device.management.common;

import io.hypersistence.tsid.TSID;

import java.util.Optional;

public class IdGenerator {

    private static final TSID.Factory tsidFactory;

    static {
        Optional.ofNullable(System.getenv("tsid.node"))
                .ifPresent(node -> System.setProperty("tsid.node", node));

        Optional.ofNullable(System.getenv("tsid.node.count"))
                .ifPresent(nodeCount -> System.setProperty("tsid.node.count", nodeCount));

        tsidFactory = new TSID.Factory.Builder().build();
    }

    private IdGenerator(){

    }

    public static TSID generateTSID() {
        return tsidFactory.generate();
    }
}
