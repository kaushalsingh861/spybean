package com.mockitoissue.spybean.domain;

import com.mockitoissue.spybean.service.Service2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
class BusinessLogic1 {

    private static Logger log = LoggerFactory.getLogger(BusinessLogic1.class);

    public BusinessLogic1(Service2 service2){
        this.service2 = service2;
    }

    private final Service2 service2;

    public  void doSomeBusiness(){
        log.info("i am doing some business");
        service2.use();
    }
}