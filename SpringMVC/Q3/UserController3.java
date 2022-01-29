package org.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController3 {
	
	@RequestMapping("/details" )
	public ModelAndView getForm()
	{
		ModelAndView model = new ModelAndView("login");
		return model;
	}
	
	@ModelAttribute
	public void addCommonObjects(Model model)
	{
		model.addAttribute("msg", "Your Credential is");
	}
	
	
	@RequestMapping("/submit")
	public ModelAndView acceptForm(@ModelAttribute("user1") User user1)
	{
		ModelAndView model = new ModelAndView("page");
		return model;
		
	}
}
