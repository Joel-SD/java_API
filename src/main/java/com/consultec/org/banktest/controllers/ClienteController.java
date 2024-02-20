package com.consultec.org.banktest.controllers;

import com.consultec.org.banktest.modelo.ClienteDTO;
import com.consultec.org.banktest.repository.entity.ClienteEntity;
import com.consultec.org.banktest.services.ClienteServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/banco")
public class ClienteController {

    @Autowired
    ClienteServiceImple serviceCliente;

    @GetMapping("/healthCheck")
    private String healthCheck() {
        return "Saludable";
    }

    @GetMapping("/cliente")
    public ResponseEntity<ClienteEntity> saveCliente() {
     //   ClienteDTO cliente = serviceCliente.saveCliente();
       // return ResponseEntity.ok(cliente).getBody();
        return null;
    }

    @GetMapping("/clientes")
    public ResponseEntity<List<ClienteDTO>> findCliente() {
        List<ClienteDTO> clientes = serviceCliente.fetchClienteList();
        return ResponseEntity.ok(clientes);
    }

    @GetMapping("/clientes/{id}")
    public ResponseEntity<Optional<ClienteEntity>> findClienteById(@PathVariable Long id) {
        Optional<ClienteEntity> cliente = serviceCliente.getClienteById(id);
        return ResponseEntity.ok(cliente);
    }


}
