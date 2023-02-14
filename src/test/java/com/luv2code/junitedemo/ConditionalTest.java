package com.luv2code.junitedemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

class ConditionalTest {
  @Test
  @Disabled("dont run until jira  #123 is resolved ")
  void basicTest(){
   //execute method and perform asserts

  }

  @Test
  @EnabledOnOs(OS.WINDOWS)
  void testForWindowsOnly(){
   //execute method and perform asserts
  }

 @Test
 @EnabledOnOs({OS.WINDOWS,OS.MAC})
 void testForWindowsAndMac(){
  //execute method and perform asserts
 }

 @Test
 @EnabledOnOs(OS.LINUX)
 void testForLINUX(){
  //execute method and perform asserts
 }

 @Test
 @EnabledOnJre(JRE.JAVA_18)
 void testForJAVA_17(){
  //execute method and perform asserts
 }

 @Test
 @EnabledIfEnvironmentVariable(named ="luv2code",matches = "dev")
 void testForDevEnvironment(){
  //execute method and perform asserts

 }

 @Test
 @EnabledIfSystemProperty(named ="luv2code_system",matches = "Ci_Cd")
 void testForSystemProperty(){
  //execute method and perform asserts

 }




}
