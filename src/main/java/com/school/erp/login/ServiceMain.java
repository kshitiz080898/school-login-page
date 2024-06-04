package com.school.erp.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The type Service main.
 */
@SpringBootApplication
@SuppressWarnings("all")
public class ServiceMain {

    private ServiceMain() {
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(ServiceMain.class, args);
    }
}
