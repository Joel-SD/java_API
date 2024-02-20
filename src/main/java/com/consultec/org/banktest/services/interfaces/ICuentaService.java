package com.consultec.org.banktest.services.interfaces;

import com.consultec.org.banktest.modelo.CuentaDTO;
import com.consultec.org.banktest.repository.entity.CuentaEntity;

import java.util.List;
import java.util.Optional;

public interface ICuentaService
{
    List<CuentaDTO> fetchCuentaList();

    Optional<CuentaEntity> getCuentaById(Long id);
}
