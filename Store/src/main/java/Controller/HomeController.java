package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Model.Product;

@Controller
public class HomeController {

	@RequestMapping("Home")
	public ModelAndView Home(Product product)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj" , product);
		mv.setViewName("Home");
		return mv;
	}
}
