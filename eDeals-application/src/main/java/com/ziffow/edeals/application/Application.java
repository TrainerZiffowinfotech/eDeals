package com.ziffow.edeals.application;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by zffow on 11/30/14.
 */
@ComponentScan(basePackages = {"com.ziffow.edeals.controller","com.ziffow.edeals.service"})
@EnableAutoConfiguration
public class Application {


        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }


}
