package com.zeroexception.common.bamboo;

import com.zeroexception.common.bamboo.instrument.Valid;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BambooApplication implements CommandLineRunner  {

  public static void main(String[] args) {
    SpringApplication.run(BambooApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    doSomething(1L);
  }

  private static void doSomething(@Valid Long n) {
    System.out.println(n.toString());
  }
}
