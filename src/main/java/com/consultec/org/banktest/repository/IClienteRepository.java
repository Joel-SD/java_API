package com.consultec.org.banktest.repository;

import com.consultec.org.banktest.repository.entity.ClienteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IClienteRepository extends CrudRepository<ClienteEntity, Long> {
    Optional<ClienteEntity> findById(Long id);
}
