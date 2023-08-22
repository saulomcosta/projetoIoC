package saulo.io.projetoMVC.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import saulo.io.projetoMVC.repository.UseresRepository;
import saulo.io.projetoMVC.services.UseresService;

/**
 * A Classe Controller é onde estão todas as requisições, nela não se usa chamar
 * diretamente o repository e sim vai na classe services onde estão todas as
 * regras de negocio envolvidas no sistema.
 * 
 * Nunca deixe regra de negocio no controller
 * 
 * @author EDS
 *
 */
@Controller
public class UseresController {

	@Autowired
	private UseresService useresService;

	@RequestMapping("/useres")
	public String getUseres(Model model) {
		model.addAttribute("useresList", useresService.findAll());

		return "useres";
	}
}
