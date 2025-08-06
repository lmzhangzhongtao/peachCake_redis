package com.peachcake.service.impl;

import com.peachcake.vo.PeachCakeVO;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({PeachCakeImpl.class})
class PeachCakeImplTest {
    @InjectMocks
    PeachCakeImpl peachCake;

    @Test
    void testMarried() {
        PeachCakeVO pea = peachCake.married("zzt");
        Assert.assertEquals("张仲涛",pea.getName());

    }
}
