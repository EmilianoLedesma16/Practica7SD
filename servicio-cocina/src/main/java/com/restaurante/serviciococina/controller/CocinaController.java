package com.restaurante.serviciococina.controller;

import com.restaurante.serviciococina.service.CocinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cocina")
public class CocinaController {

    @Autowired
    private CocinaService cocinaService;

    // Endpoint para procesar un pedido, simulando que se marca como en preparación
    @PostMapping("/procesar/{pedidoId}")
    public String procesarPedido(@PathVariable Long pedidoId) {
        return cocinaService.procesarPedido(pedidoId);
    }
}
