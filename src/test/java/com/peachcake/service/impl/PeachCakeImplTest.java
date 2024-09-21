package com.peachcake.service.impl;

import com.peachcake.vo.PeachCakeVO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PeachCakeImplTest {

    private PeachCakeImpl peachCakeImplUnderTest;

    @BeforeEach
    void setUp() {
        peachCakeImplUnderTest = new PeachCakeImpl();
    }

    @Test
    void testFallInLove() {
//        assertThat(peachCakeImplUnderTest.fallInLove()).isEqualTo("this is a beautiful day");

    }

    @Test
    void testMarried() {
        // Setup
        // Run the test
        final PeachCakeVO result = peachCakeImplUnderTest.married("name");

        // Verify the results
    }
}
