package com.ehc.starter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
//@EnableAutoConfiguration
//@EnableMongoRepositories
//@ImportResource("classpath:SpringContext.xml")
public class Application {
  public static void main(String[] args) {
    new ClassPathXmlApplicationContext("applicationContext.xml");
  }
}
