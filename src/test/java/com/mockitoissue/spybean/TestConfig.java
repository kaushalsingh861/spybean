package com.mockitoissue.spybean;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Configuration
public class TestConfig {

    private static Logger log = LoggerFactory.getLogger(TestConfig.class);
    @PostConstruct
    public void createHeavyResource(){
        log.info("i create some heavy resource, should be called only once per test suite");
    }
}
