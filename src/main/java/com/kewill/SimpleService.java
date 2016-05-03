package com.kewill;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class SimpleService {
    static final Logger LOG = LoggerFactory.getLogger(SimpleService.class);

    public Integer add(Integer a, Integer b) {
        LOG.debug("a={}, b={}", a, b);
        return a + b;
    }
}
