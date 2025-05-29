package com.bangroseron.atm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bangroseron.atm.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByIdentificacion(String identificacion);
    

}
