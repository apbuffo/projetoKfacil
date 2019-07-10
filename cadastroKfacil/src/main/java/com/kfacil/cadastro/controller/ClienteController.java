package com.kfacil.cadastro.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kfacil.cadastro.entity.Cliente;
import com.kfacil.cadastro.repository.ClienteRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Cliente")
public class ClienteController {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@ApiOperation(value="Retorna uma lista de Clientes")
	@GetMapping("/cliente")
	@ResponseBody
	public List<Cliente> listaCliente(){
		return clienteRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um cliente unico")
	@GetMapping("/cliente/{id}")
	@ResponseBody
	public Cliente consultaCliente(@PathVariable(value="id") long id){
		return clienteRepository.findById(id);
	}
	
	@ApiOperation(value="Salva um cliente")
	@PostMapping("/cliente")
	@ResponseBody
	public Cliente salvaCliente(@RequestBody @Valid Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@ApiOperation(value="Deleta um cliente")
	@DeleteMapping("/cliente/{id}")
	public void deletaCliente(@PathVariable(value="id") long id) {
		clienteRepository.delete(clienteRepository.findById(id));
	}
	
	@ApiOperation(value="Atualiza um cliente")
	@PutMapping("/cliente")
	@ResponseBody
	public Cliente atualizaCliente(@RequestBody @Valid Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	 

}
