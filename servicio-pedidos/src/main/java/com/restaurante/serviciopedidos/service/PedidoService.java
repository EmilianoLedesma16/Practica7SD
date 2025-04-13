package com.restaurante.serviciopedidos.service;

import com.restaurante.serviciopedidos.dto.PedidoDTO;
import com.restaurante.serviciopedidos.model.Pedido;
import com.restaurante.serviciopedidos.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private RestTemplate restTemplate;

    private static final String URL_COCINA = "http://localhost:8081/cocina/procesar/";


    public Pedido crearPedido(PedidoDTO pedidoDTO) {
        // Crear un nuevo pedido con ID automático (simulado)
        Pedido pedido = new Pedido();
        pedido.setId((long) (Math.random() * 1000));  // Simulación de generación de ID
        pedido.setClienteId(pedidoDTO.getClienteId());
        pedido.setProductos(pedidoDTO.getProductos());
        pedido.setNota(pedidoDTO.getNota());

       Pedido pedidoGuardado = pedidoRepository.save(pedido);

       String respuestaCocina = restTemplate.postForObject(URL_COCINA + pedidoGuardado.getId(), null, String.class);

        System.out.println(respuestaCocina);
        return pedidoGuardado;
    }

    public Optional<Pedido> obtenerPedidoPorId(Long id) {
        return pedidoRepository.findById(id);
    }
}
