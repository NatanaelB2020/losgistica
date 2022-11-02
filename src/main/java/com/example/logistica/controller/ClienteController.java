package com.example.logistica.controller;

import com.example.logistica.entity.ClientesEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<ClientesEntity> listar(){
        var cliente1 = new ClientesEntity();
        cliente1.setId(2L);
        cliente1.setName("João");
        cliente1.setEmail("joao@gmail.com");
        cliente1.setTelefone("9912345566");

        var cliente2 = new ClientesEntity();
        cliente2.setId(3L);
        cliente2.setName("Juan");
        cliente2.setEmail("juan@gmail.com");
        cliente2.setTelefone("9912346677");

        return Arrays.asList(cliente1, cliente2);
    }
}
