package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	public List<Cliente> findByDni(int dni);
	public List<Cliente> findByNombreIgnoreCase(String Case);
}
