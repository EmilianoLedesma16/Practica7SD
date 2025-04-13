package com.restaurante.serviciopedidos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServicioPedidosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicioPedidosApplication.class, args);
        System.out.println("✅ Microservicio de Pedidos iniciado correctamente");
    }
}
