package com.restaurante.servicionotificaciones.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notificaciones")
public class NotificacionesController {

    @PostMapping("/enviar/{pedidoId}")
    public String enviarNotificacion(@PathVariable Long pedidoId) {
        System.out.println("Notificación enviada para el pedido " + pedidoId);
        return "Notificación enviada para el pedido " + pedidoId;
    }
}
