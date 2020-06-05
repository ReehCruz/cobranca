package com.rebeca.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rebeca.cobranca.model.Titulo;

public interface TitulosRepository extends JpaRepository<Titulo, Long> {

}
