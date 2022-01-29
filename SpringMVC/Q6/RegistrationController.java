/*package com.validation;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {

  @RequestMapping(value = "/register", method = RequestMethod.GET)
  public String showForm(Model model) {
    model.addAttribute("registration", new RegistrationBean());
    return "register";
  }

  @RequestMapping(value = "/processForm", method = RequestMethod.POST)
  public String processForm(@Valid @ModelAttribute("registration") RegistrationBean register,
      BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return "register";
    } else {
      return "success";
    }

  }
}*/




/*package com.validation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
	
	@RequestMapping("/register" )
	public ModelAndView getForm()
	{
		ModelAndView model = new ModelAndView("register");
		return model;
	}
	
	@RequestMapping("/success")
	public ModelAndView acceptForm(@ModelAttribute("register") RegistrationBean reg)
	{
		ModelAndView model = new ModelAndView("success");
		return model;
		
	}
}*/






package com.validation;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {

  @RequestMapping("/register")
  public String showForm(Model model) {
    model.addAttribute("registration", new RegistrationBean());
    return "register";
  }

  @RequestMapping("/processForm")
  public String processForm(@Valid @ModelAttribute("registration") RegistrationBean register,
      BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return "register";
    } 
    else 
    {
      return "success";
    }

  }
}