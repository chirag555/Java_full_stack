package spring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.model.User;

@Controller
public class MainController {
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView modelAndView =new ModelAndView("userFormView");
		User user=new User();
		modelAndView.addObject("user",user);
		return modelAndView;
	}
	@PostMapping("/displayUserInfo")
	public ModelAndView displayUserInfo(@ModelAttribute User user) {
		ModelAndView modelAndView =new ModelAndView("displayUserInfo");
		
		System.out.println(user);
		return modelAndView;
		
	}

}
