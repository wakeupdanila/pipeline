package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;

@SpringBootTest
public class AddTest {
    @Autowired
    private Add add;

    @Test
    void numbersCorrect_returnCorrectResult() {
        Assertions.assertEquals(4, add.add(2, 2));
    }

}
