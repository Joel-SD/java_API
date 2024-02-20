package com.consultec.org.banktest.services.interfaces;

import com.consultec.org.banktest.modelo.ClienteDTO;
import com.consultec.org.banktest.repository.entity.ClienteEntity;

import java.util.List;
import java.util.Optional;

public interface IClienteService {

    ClienteEntity saveCliente();

    // Recuperar toda la lista de clientes
    List<ClienteDTO> fetchClienteList();

    Optional<ClienteEntity> getClienteById(Long id);
}
