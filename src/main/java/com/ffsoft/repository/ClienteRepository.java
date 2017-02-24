package com.ffsoft.repository;

import org.springframework.data.repository.CrudRepository;
import com.ffsoft.entity.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
	
	
}
