package com.consultec.org.banktest.repository;

import com.consultec.org.banktest.modelo.CuentaDTO;
import com.consultec.org.banktest.repository.entity.CuentaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICuentaRepository extends CrudRepository<CuentaEntity, Long> {
    Optional<CuentaEntity> findById(Long id);

}
