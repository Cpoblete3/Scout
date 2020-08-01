package cl.cpoblete.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/principal")

public class PrincipalController {
	
	@GetMapping ("/principalUsuario")
	public String principalUsuario (ModelMap mapa) {
		String paginaInicio = "principal/principalUsuario";
		return paginaInicio;

	}
	
	@GetMapping ("/principalAdmin")
	public String principalAdmin (ModelMap mapa) {
		String paginaInit = "principal/principalAdmin";
		return paginaInit;

	}
	
}
