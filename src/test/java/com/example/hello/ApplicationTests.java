package com.example.hello;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApplicationTests {

    @Test
    public String contextLoads() {
        return "hello world ss";
    }

}
