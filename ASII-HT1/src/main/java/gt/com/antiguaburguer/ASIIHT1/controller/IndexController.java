package gt.com.antiguaburguer.ASIIHT1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {
	@GetMapping("/api")
    public String Saludo(@RequestParam String nombre, Model mimodelo){
        //return "Hola Sr." + nombre;
        mimodelo.addAttribute("name",nombre);
        return "Index"; //nombre de la plantilla
    }	
	
	@GetMapping("/ejemplosuma")
	public String Suma(@RequestParam int numero1, @RequestParam int numero2, Model mimodelo) {
		mimodelo.addAttribute("sum", numero1+numero2);
		return "Index"; //nombre de la plantilla
	}
	
	@RequestMapping("/showmenu")
    public String product(Model model) {
        //model.addAttribute("products", productRepository.findAll());
        return "Menu";
    }
	
	@RequestMapping("/addmenu")
	public String save(@RequestParam String prodName, @RequestParam String prodId, Model mimodelo) {
		mimodelo.addAttribute("item", prodName);
	//return "saludo" + product.getId();
		return "Menu";
	}
}
