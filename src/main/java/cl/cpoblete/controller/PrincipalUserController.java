package cl.cpoblete.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/principalUsuario")

public class PrincipalUserController {
	
	@GetMapping
	public String principal(ModelMap mapa) {
		String paginaInicio = "principal/principalUsuario";
		return paginaInicio;

	}
}
