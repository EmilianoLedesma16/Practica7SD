package com.restaurante.serviciococina.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CocinaService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String URL_FACTURACION = "http://localhost:8082/facturacion/calcular?pedidoId=";
    private static final String URL_NOTIFICACION = "http://localhost:8083/notificaciones/enviar/";


    public String procesarPedido(Long pedidoId) {
        // Simular procesamiento
        System.out.println("Procesando el pedido con ID: " + pedidoId);

        // Llamada al microservicio de facturación
        String respuestaFacturacion = restTemplate.postForObject(
                URL_FACTURACION + pedidoId,
                null,
                String.class
        );
        System.out.println("Respuesta de facturación: " + respuestaFacturacion);

        String respuestaNotificacion = restTemplate.postForObject(URL_NOTIFICACION + pedidoId, null, String.class);
        System.out.println("Respuesta de notificacion: " + respuestaNotificacion);


        return "Pedido " + pedidoId + " en preparación.\n" + respuestaFacturacion + "\n" + respuestaNotificacion;
    }
}
