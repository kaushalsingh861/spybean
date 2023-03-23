package com.mockitoissue.spybean.domain;

import com.mockitoissue.spybean.SpybeanApplicationTests;
import com.mockitoissue.spybean.service.Service1;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.SpyBean;

public class Business1Test extends SpybeanApplicationTests {

    @SpyBean
    Service1 service1;

    @Test
    public void test(){
        Assertions.assertThat(1).isEqualTo(1);
    }

}
