package com.consultec.org.banktest.controllers;

import com.consultec.org.banktest.modelo.CuentaDTO;
import com.consultec.org.banktest.repository.entity.CuentaEntity;
import com.consultec.org.banktest.services.CuentaServiceImple;
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
public class CuentaController {

    @Autowired
    CuentaServiceImple serviceImple;

    @GetMapping("/cuentas")
    public ResponseEntity<List<CuentaDTO>> findCuentas() {
        List<CuentaDTO> cuentas = serviceImple.fetchCuentaList();
        return ResponseEntity.ok(cuentas);
    }

    @GetMapping("/cuentas/{id}")
    public ResponseEntity<Optional<CuentaEntity>> findCuentasById(@PathVariable Long id) {
        Optional<CuentaEntity> cuenta = serviceImple.getCuentaById(id);
        return ResponseEntity.ok(cuenta);
    }


}
