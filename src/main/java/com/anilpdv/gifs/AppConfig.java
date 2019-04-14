package com.anilpdv.gifs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;
import org.thymeleaf.spring5.SpringTemplateEngine;

@EnableAutoConfiguration
@ComponentScan
public class AppConfig {


    public static void main(String[] args) {

        SpringApplication.run(AppConfig.class,args);

    }


}
