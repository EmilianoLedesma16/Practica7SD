package com.restaurante.serviciopedidos.repository;

import com.restaurante.serviciopedidos.model.Pedido;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PedidoRepository {

    private List<Pedido> pedidos = new ArrayList<>();

    public Pedido save(Pedido pedido) {
        pedidos.add(pedido);
        return pedido;
    }

    public Optional<Pedido> findById(Long id) {
        return pedidos.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    public List<Pedido> findAll() {
        return pedidos;
    }
}
