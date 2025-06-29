package org.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.error("❌ Critical error occurred while processing user request.");
        logger.warn("⚠️ Disk space is running low.");
        logger.info("ℹ️ Application started successfully.");
    }
}
