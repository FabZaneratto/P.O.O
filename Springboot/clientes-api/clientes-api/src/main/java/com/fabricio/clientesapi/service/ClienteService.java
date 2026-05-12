package com.fabricio.clientesapi.service;


import com.fabricio.clientesapi.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    private List<Cliente> lista = new ArrayList<>();
    private Long nextId = 1L;

    public List<Cliente> listar(){
         return lista;
    }

    public Cliente cria (Cliente novo){
         novo.setId(nextId);
         nextId++;
         lista.add(novo);
         return novo;
    }

    public Cliente buscarPorId(Long id){
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId().equals(id)){
                return lista.get(i);
            }
        }
        return null;
    }

    public boolean remover(Long id){
         return lista.removeIf(p -> p.getId().equals(id));
    }

    public Cliente atualizar (Long id, Cliente novo){
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getId().equals(id)){
               novo.setId((id));
               lista.set(i, novo);
               return novo;
            }
        }
        return null;
    }
}
