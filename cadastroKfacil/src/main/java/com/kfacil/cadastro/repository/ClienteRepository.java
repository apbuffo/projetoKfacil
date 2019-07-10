package com.kfacil.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kfacil.cadastro.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	Cliente findById(long id);

}
