package com.jorgesoares.projetotcc.controller;

import com.jorgesoares.projetotcc.entity.Client;
import com.jorgesoares.projetotcc.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping(value="/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Client> find(

            @PathVariable Integer id) {

        Client obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }
}
