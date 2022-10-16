package com.appweb.appweb.Repositorio;

import com.appweb.appweb.Entidad.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {

}
