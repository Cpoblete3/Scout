package cl.cpoblete.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/")
public class HomeController {
	
	@GetMapping
	public String index(ModelMap mapa) {
		String vista = "home/index";
		return vista;

	}

}
