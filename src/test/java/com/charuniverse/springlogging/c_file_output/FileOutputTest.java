package com.charuniverse.springlogging.c_file_output;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@Slf4j
@SpringBootTest
@TestPropertySource("classpath:/application-first.properties")
public class FileOutputTest {

    @Test
    void testLog() {
        log.trace("This is trace log");
        log.debug("This is debug log");
        log.info("This is info log");
        log.warn("This is warn log");
        log.error("This is error log");
    }
}
