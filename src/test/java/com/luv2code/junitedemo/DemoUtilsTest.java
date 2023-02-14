package com.luv2code.junitedemo;

import com.luv2code.junitdemo.DemoUtils;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class DemoUtilsTest {
    DemoUtils demoUtils;
    @BeforeEach
    void  setupBeforeEach(){
         demoUtils=new DemoUtils();
    }


    @Test
//    @DisplayName("Equals and not Equals")
    void testEqualsAndNotEquals(){
        assertEquals(6,demoUtils.add(2,4),"2+6 must be 6");
        assertNotEquals(6,demoUtils.add(1,9),"1+9 must be 10");

    }

    @Test
//    @DisplayName("Null and not Null")
    void testNullAndNotNull(){
        String x=null;
        String y="luv2code";

        assertNull(demoUtils.checkNull(x),"object should be null");
        assertNotNull(demoUtils.checkNull(y),"object should be not null");

    }

}
//  @AfterEach
//    void  setupAfterEach(){
//        demoUtils=new DemoUtils();
//        System.out.println("@AfterEach executes before the execution of each test method");
//        System.out.println();
//    }
//    @BeforeAll
//    static  void setupBeforeAllClass(){
//
//        System.out.println("@BeforeAll executes before the execution of all test method");
//    }
//
//    @AfterAll
//    static  void setupAfterAllClass(){
//
//        System.out.println("@AfterAll executes after the execution of all test method");
//    }