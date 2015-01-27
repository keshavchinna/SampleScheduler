package com.ehc.starter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

  public static void main(String[] args) {
    new ClassPathXmlApplicationContext("applicationContext.xml");
  }
}
