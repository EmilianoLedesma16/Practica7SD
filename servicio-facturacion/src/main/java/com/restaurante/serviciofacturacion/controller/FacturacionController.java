package com.restaurante.serviciofacturacion.controller;

import com.restaurante.serviciofacturacion.service.FacturacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/facturacion")
public class FacturacionController {

    @Autowired
    private FacturacionService facturacionService;

    // Endpoint para calcular el total de un pedido
    @PostMapping("/calcular")
    public String calcularTotal(@RequestParam Long pedidoId) {
        return facturacionService.calcularTotal(pedidoId);
    }
}
