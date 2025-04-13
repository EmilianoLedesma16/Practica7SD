package com.restaurante.serviciofacturacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServicioFacturacionApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicioFacturacionApplication.class, args);
        System.out.println("✅ Microservicio de Facturación iniciado correctamente");

    }


}
