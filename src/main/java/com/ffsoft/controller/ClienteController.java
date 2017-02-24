package com.ffsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ffsoft.entity.Cliente;
import com.ffsoft.repository.ClienteRepository;

@Controller
@RequestMapping(path="/cliente")
public class ClienteController {

	
	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping(path="/add")
	public @ResponseBody String addNovoCliente(@RequestParam String nome) {
		
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		
		clienteRepository.save(cliente);
			
		return "Cliente adicionado com sucesso.";
	}
	
	
	@GetMapping(path="/todos")
	public @ResponseBody Iterable<Cliente> getTodosClientes(){
		return clienteRepository.findAll();
	}
	
}
