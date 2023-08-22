package saulo.io.projetoMVC.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import saulo.io.projetoMVC.entity.Useres;
import saulo.io.projetoMVC.repository.UseresRepository;

/**
 * Esta classe service é onde está toda regra de negocio e onde comunica com a
 * classe repository, então qualquer tido de regra ou busca de dados, mantenhas
 * se nesta classe services.
 * 
 * @author EDS
 *
 */
@Service
public class UseresService {

	@Autowired
	UseresRepository useresRepository;

	public List<Useres> findAll() {
		return useresRepository.findAll();
	}
}
