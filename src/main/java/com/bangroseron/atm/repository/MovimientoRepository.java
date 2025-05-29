package com.bangroseron.atm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bangroseron.atm.entity.Cuenta;
import com.bangroseron.atm.entity.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {
   List<Movimiento> findByCuenta(Cuenta cuenta);
   List<Movimiento> findByCuentaOrderByFechaDesc(Cuenta cuenta);

}
