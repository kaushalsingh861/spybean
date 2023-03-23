package com.mockitoissue.spybean.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class Service1 {

    private static Logger log = LoggerFactory.getLogger(Service1.class);
    public void printSomething(){
        log.info("I only print service1");
    }
}
