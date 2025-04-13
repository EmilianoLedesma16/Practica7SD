package com.restaurante.serviciococina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServicioCocinaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicioCocinaApplication.class, args);
        System.out.println("✅ Microservicio de Cocina iniciado correctamente");
    }
}
