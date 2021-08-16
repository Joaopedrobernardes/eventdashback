package br.com.jpcorp.eventdash.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jpcorp.eventdash.dao.AlarmeDAO;
import br.com.jpcorp.eventdash.model.Alarme;

@RestController
public class AlarmeController {

	@Autowired  //aqui ele é responsável, além de buscar o objeto que faz a implementacao da interface,
				//ele tb cria a instanciacao do objeto, ou seja, nao preciso dar NEW
	private AlarmeDAO dao;

	// quero criar um método que me retorne TODOS os alarmes gravados no banco
	@GetMapping("/alarmes")
	public ArrayList<Alarme> recuperarTodos() {

		// basicamente ele deve entrar em contato com o banco de dados e fazer um SELECT
		ArrayList<Alarme> lista;
		lista = (ArrayList<Alarme>)dao.findAll();
		return lista;
		
		
		
		
		
	}

}
