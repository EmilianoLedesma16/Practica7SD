package com.restaurante.servicionotificaciones.service;

import org.springframework.stereotype.Service;

@Service
public class NotificacionesService {

    // Simula el envío de una notificación
    public String enviarNotificacion(String clienteId, String mensaje) {
        // Aquí puedes agregar lógica real para enviar la notificación
        System.out.println("Enviando notificación al cliente " + clienteId + ": " + mensaje);
        return "Notificación enviada a cliente " + clienteId + ": " + mensaje;
    }
}
