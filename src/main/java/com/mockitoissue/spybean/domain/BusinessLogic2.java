package com.mockitoissue.spybean.domain;

import com.mockitoissue.spybean.service.Service4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BusinessLogic2 {

    private static Logger log = LoggerFactory.getLogger(BusinessLogic2.class);

    public BusinessLogic2(Service4 service4) {
        this.service4 = service4;
    }

    private final Service4 service4;

    public void doSomeBusiness(){
        log.info("I am doing some business");
        service4.use();
    }

}
