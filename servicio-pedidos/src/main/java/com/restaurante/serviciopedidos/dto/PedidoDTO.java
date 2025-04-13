package com.restaurante.serviciopedidos.dto;

import com.restaurante.serviciopedidos.model.Producto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidoDTO {
    private String clienteId;
    private List<Producto> productos;
    private String nota;
}
