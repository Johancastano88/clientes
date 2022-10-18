package com.appweb.appweb.Repositorio;

import com.appweb.appweb.Entidad.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
