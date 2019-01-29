package com.carlos.ceiba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlos.ceiba.model.ClienteMD;

@Repository
public interface ClienteRP   extends  JpaRepository< ClienteMD, Integer>{

}
