package com.mockitoissue.spybean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

@Configuration
@Profile("heavyResource")
public class TestConfig {

    private static Logger log = LoggerFactory.getLogger(TestConfig.class);
    @PostConstruct
    public void createHeavyResource(){
        log.info("i create some heavy resource, should be called only once per test suite");
    }
}
