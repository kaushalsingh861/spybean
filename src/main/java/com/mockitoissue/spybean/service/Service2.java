package com.mockitoissue.spybean.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class Service2 {

    public Service2(Service1 service1) {
        this.service1 = service1;
    }

    private static Logger log = LoggerFactory.getLogger(Service2.class);
    private final Service1 service1;

    public void use(){
        log.info("I use service 1");
    }
}
