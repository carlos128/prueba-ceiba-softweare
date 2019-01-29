package com.carlos.ceiba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlos.ceiba.model.ProductoMD;

@Repository
public interface ProductoRP  extends  JpaRepository< ProductoMD, Integer>{

}
