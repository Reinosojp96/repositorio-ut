package com.systempaymentut.proyecto_fullstack_backend_ut.repository;

import java.util.List;

import com.systempaymentut.proyecto_fullstack_backend_ut.entities.Pago;
import com.systempaymentut.proyecto_fullstack_backend_ut.enums.PagoStatus;

import org.springframework.data.jpa.repository.JpaRepository;

import com.systempaymentut.proyecto_fullstack_backend_ut.enums.TypePago;

public interface PagoRepository extends JpaRepository<Pago, Long> {

    List<Pago> findByEstudianteCodigo(String codigo);

    List<Pago> findByStatus(PagoStatus status);

    List<Pago> findByType(TypePago type);

}
