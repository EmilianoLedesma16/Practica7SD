package com.restaurante.serviciofacturacion.service;

import org.springframework.stereotype.Service;

@Service
public class FacturacionService {

    // Método para calcular el total de un pedido
    public String calcularTotal(Long pedidoId) {
        // Lógica para calcular el total (aquí vamos a simularlo con un valor fijo)
        double total = 250.50;  // Valor simulado para el total
        System.out.println("Calculando el total para el pedido con ID: " + pedidoId);
        return "El total del pedido " + pedidoId + " es: $" + total;
    }
}
