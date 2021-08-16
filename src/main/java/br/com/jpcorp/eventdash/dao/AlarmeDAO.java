package br.com.jpcorp.eventdash.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.jpcorp.eventdash.model.Alarme;

public interface AlarmeDAO extends CrudRepository <Alarme, Integer>{
	
	

}
