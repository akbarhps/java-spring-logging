package com.charuniverse.springlogging.a_default_logging_setting;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class LoggingTest {

    @Test
    void testLog() {
        log.trace("This is trace log");
        log.debug("This is debug log");
        log.info("This is info log");
        log.warn("This is warn log");
        log.error("This is error log");
    }
}
