package cl.cpoblete.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/principalAdmin")
public class PrincipalAdminController {

		
		@GetMapping
		public String principalAdmin (ModelMap mapa) {
			String paginaInit = "principal/principalAdmin";
			return paginaInit;

		}
	}

