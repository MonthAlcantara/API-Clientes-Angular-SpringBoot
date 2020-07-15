package io.github.monthalcantara.service.interfaces;

import io.github.monthalcantara.model.Cliente;
import org.springframework.data.domain.Example;

import java.util.List;

public interface ClienteService {
    List<Cliente> findAll(Example example);

    Cliente save(Cliente cliente);

    void delete(Integer id);

    void update(Integer id, Cliente cliente);

    Cliente findById(Integer id);
}
