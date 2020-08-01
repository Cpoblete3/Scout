package cl.cpoblete.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("/unidad")
public class UnidadController {

	
	@GetMapping ("/golondrinas")
	public String golondrinas(ModelMap mapa) {
		String golo = "unidad/golondrinas";
		return golo;
	}
	
	@GetMapping ("/lobatos")
	public String lobatos (ModelMap mapa) {
		String lobo = "unidad/lobatos";
		return lobo;
	}
	
	@GetMapping ("/guias")
	public String guias (ModelMap mapa) {
		String guia = "unidad/guias";
		return guia;
	}
	
	@GetMapping ("/tropa")
	public String tropa (ModelMap mapa) {
		String tropa = "unidad/tropa";
		return tropa;
	}
	
	@GetMapping ("/pioneros")
	public String pioneros (ModelMap mapa) {
		String avan = "unidad/pioneros";
		return avan;
	}
	
	@GetMapping ("/clan")
	public String clan (ModelMap mapa) {
		String clan = "unidad/clan";
		return clan;
	}
	
	
		
}
