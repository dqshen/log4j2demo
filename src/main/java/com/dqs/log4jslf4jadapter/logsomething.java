package com.dqs.log4jslf4jadapter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class logsomething {

    protected static final Logger Logger = LogManager.getLogger();

    public static void hellolog() {

        Logger.info("hello log4j2!");

    }
}
