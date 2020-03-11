package com.acme;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SampleTest {
    @Test
    public void testGreeting() {
        // expect:
        assertEquals("Hello world", new Sample().greeting());
    }
}