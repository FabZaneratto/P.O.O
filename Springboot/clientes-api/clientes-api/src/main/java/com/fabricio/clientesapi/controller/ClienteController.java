package com.fabricio.clientesapi.controller;

import com.fabricio.clientesapi.model.Cliente;
import com.fabricio.clientesapi.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;


@RestController

@RequestMapping("/clientes")

public class ClienteController {

    @Autowired
    ClienteService service;

    @GetMapping
    public ResponseEntity<List<Cliente>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @PostMapping
    public ResponseEntity<Cliente> cria(@RequestBody Cliente cliente){
        Cliente criado = service.cria(cliente);
        URI uri = URI.create("/cliente/" + criado.getId());
        return ResponseEntity.created(uri).body(criado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity remover(@PathVariable Long id){
        return service.remover(id) ? ResponseEntity.noContent().build()
                                   : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity <Cliente >atualizar(@PathVariable Long id,
                                              @RequestBody Cliente novo){
        Cliente atualizado = service.atualizar(id, novo);
        return (atualizado != null) ? ResponseEntity.ok(atualizado) :
                ResponseEntity.notFound().build();
    }
}
