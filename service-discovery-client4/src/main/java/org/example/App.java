package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class App {
    public static void main( String[] args ) {
        System.out.println("Starting Course Service ...");
        SpringApplication.run(App.class, args);
    }
}
