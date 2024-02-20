package com.consultec.org.banktest.services.mapping;

import com.consultec.org.banktest.modelo.CuentaDTO;
import com.consultec.org.banktest.repository.entity.CuentaEntity;

public class CuentaMap {

    public static CuentaDTO mapCuentaEntityToDTO(CuentaEntity cuentaEntity) {
        CuentaDTO cuentaDTO = new CuentaDTO();
        cuentaDTO.setNumeroCuenta(cuentaEntity.getNumeroCuenta());
        cuentaDTO.setAlias(cuentaEntity.getAlias());
        cuentaDTO.setEstado(cuentaEntity.getEstado());
        cuentaDTO.setTipoCuenta(cuentaEntity.getTipoCuenta());
        cuentaDTO.setBalance(cuentaEntity.getBalance());
        cuentaDTO.setInteres(cuentaEntity.getInteres());
        cuentaDTO.setFecha_creacion(cuentaEntity.getFecha_creacion());
        return cuentaDTO;
    }
}
