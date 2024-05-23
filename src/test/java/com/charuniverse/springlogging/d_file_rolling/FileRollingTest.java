package com.charuniverse.springlogging.d_file_rolling;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@Slf4j
@SpringBootTest
@TestPropertySource("classpath:/application-first.properties")
public class FileRollingTest {

    @Test
    void testLog() {
        for (int i = 0; i < 100_000; i++) {
            log.warn("Log ke {}", i);
        }
    }
}
