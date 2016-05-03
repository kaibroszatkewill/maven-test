package com.kewill;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class SimpleServiceTest {

    SimpleService simpleService = new SimpleService();
    
    @Test
    public void testAddInteger() {
        assertThat(simpleService.add(1, 2), is(3));
    }

    @Test(expected=NullPointerException.class)
    public void testAddNull() {
        simpleService.add(null, 2);
    }
}
