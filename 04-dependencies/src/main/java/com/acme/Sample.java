package com.acme;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.apache.commons.lang3.StringUtils.capitalize;

public class Sample {
    private static final Logger LOG = LoggerFactory.getLogger(Sample.class);

    public String greeting() {
        return capitalize("hello world");
    }

    public static void main(String[] args) {
        Sample s = new Sample();
        LOG.info(s.greeting());
    }
}
