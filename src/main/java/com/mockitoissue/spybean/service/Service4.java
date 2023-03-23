package com.mockitoissue.spybean.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service

public class Service4 {

    private static Logger log = LoggerFactory.getLogger(Service4.class);

    public Service4(Service3 service3) {
        this.service3 = service3;
    }

    private final Service3 service3;


    public void use(){
        log.info("I use service 3");
        service3.printAnotherThing();
    }
}
