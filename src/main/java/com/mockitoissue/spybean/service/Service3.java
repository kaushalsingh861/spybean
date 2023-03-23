package com.mockitoissue.spybean.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class Service3 {

    private static Logger log = LoggerFactory.getLogger(Service3.class);

    public void printAnotherThing(){
        log.info("I print service 3");
    }
}
