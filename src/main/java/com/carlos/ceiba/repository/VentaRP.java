package com.carlos.ceiba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlos.ceiba.model.VentaMD;

@Repository
public interface VentaRP extends  JpaRepository< VentaMD, Integer> {

}
