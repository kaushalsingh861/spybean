package com.mockitoissue.spybean.domain;

import com.mockitoissue.spybean.SpybeanApplicationTests;
import com.mockitoissue.spybean.service.Service1;
import com.mockitoissue.spybean.service.Service2;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.SpyBean;

public class Business2Test extends SpybeanApplicationTests {

    @SpyBean
    Service2 service2;


    @Test
    public void test(){
        Assertions.assertThat(1).isEqualTo(1);
    }
}
