package com.luv2code.junitedemo;

import com.luv2code.junitdemo.DemoUtils;
import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DemoUtilsTest {
    DemoUtils demoUtils;
    @BeforeEach
    void  setupBeforeEach(){
         demoUtils=new DemoUtils();
    }
    @Test
    @DisplayName("Multiply")
    void testMultiply(){
        assertEquals(12 ,demoUtils.multiply(4,3),"4*3 must be 12");
    }



    @Test
    @DisplayName("Equals and not Equals")
    void testEqualsAndNotEquals(){
        assertEquals(6,demoUtils.add(2,4),"2+6 must be 6");
        assertNotEquals(6,demoUtils.add(1,9),"1+9 must be 10");

    }

    @Test
    @DisplayName("Null and not Null")
    void testNullAndNotNull(){
        String x=null;
        String y="luv2code";

        assertNull(demoUtils.checkNull(x),"object should be null");
        assertNotNull(demoUtils.checkNull(y),"object should be not null");

    }
    @Order(1)
    @DisplayName("same and not same")
    @Test
    void testSameAndNotSame(){

        String str="luv2code";
        assertSame(demoUtils.getAcademy(),demoUtils.getAcademyDuplicate(),"object should refer to the same object");
        assertNotSame(str,demoUtils.getAcademy(),"object should not refer to the same object");

    }
    @Order(2)
    @DisplayName("true and not false")
    @Test
    void testTrueOrFalse(){
        int gradeOne=10;
        int gradeTwo=5;
        assertTrue(demoUtils.isGreater(gradeOne,gradeTwo),"this should return true");
        assertFalse(demoUtils.isGreater(gradeTwo,gradeOne),"this should return true");
    }
    @DisplayName("Array Equals")
    @Test
    void testArrayEquals(){
        String[] StringArray={"A","B","C"};
        assertArrayEquals(StringArray,demoUtils.getFirstThreeLettersOfAlphabet(),"Array should be the same ");

    }
    @DisplayName("Iterable Equals")
    @Test
    void  testIterableEquals(){
        List<String>theList=List.of("luv", "2", "code");
        assertIterableEquals(theList,demoUtils.getAcademyInList(),"expect should be same as actual list");

    }
    @DisplayName("lines matches")
    @Test
    void  testLineMatch(){
        List<String>theList=List.of("luv", "2", "code");
        assertLinesMatch(theList,demoUtils.getAcademyInList(),"lines should match");

    }
    @DisplayName("throws and does not throw ")
    @Test
    void TestThrowsAndDoesNot(){

        assertThrows(Exception.class,()->{demoUtils.throwException(-1);},"should throw exception");
        assertDoesNotThrow(()->{demoUtils.throwException(1);},"should throw exception");

    }
    @DisplayName("Timeout")
    @Test
    void testTimeOut(){
        assertTimeout(Duration.ofSeconds(3),()->{demoUtils.checkTimeout();},"method should execute in 3 seconds");

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