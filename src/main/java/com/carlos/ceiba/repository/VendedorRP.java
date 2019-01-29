package com.carlos.ceiba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlos.ceiba.model.VendedorMD;

@Repository
public interface VendedorRP  extends  JpaRepository<VendedorMD, Integer> {

}
