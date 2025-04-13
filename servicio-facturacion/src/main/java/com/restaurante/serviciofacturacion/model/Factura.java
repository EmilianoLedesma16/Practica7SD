package com.restaurante.serviciofacturacion.model;

import lombok.Data;

@Data
public class Factura {
    private Long pedidoId;
    private double total;
}
