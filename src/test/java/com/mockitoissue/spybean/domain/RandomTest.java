package com.mockitoissue.spybean.domain;

import com.mockitoissue.spybean.SpybeanApplicationTests;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.SpyBean;

public class RandomTest extends SpybeanApplicationTests {

    @SpyBean
    BusinessLogic1 businessLogic1;

    @Test
    public void someAsset(){
        Assertions.assertThat(1).isNotEqualTo(3);
    }

}
