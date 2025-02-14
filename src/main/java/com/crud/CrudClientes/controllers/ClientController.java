package com.crud.CrudClientes.controllers;

import com.crud.CrudClientes.services.ClientService;
import com.crud.CrudClientes.services.ClientServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes")
public class ClientController {
    private final ClientService clientService;
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
}
