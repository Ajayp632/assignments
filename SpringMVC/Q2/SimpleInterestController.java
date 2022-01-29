package org.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleInterestController {
	
	@RequestMapping("/getvalues")
	public String getForm() 
	{
		
		return "SimpleInterest";
	}
	
	@RequestMapping("/submitvalues")
	public ModelAndView acceptForm(@RequestParam("amt") double amt, @RequestParam("r") double r, @RequestParam("t") int t )
	{
		ModelAndView model = new ModelAndView("Calculate");
		model.addObject("msg", "Simple Interest : " + "(" + amt + "*" + r + "*" + t + ")/100 = " + (amt*r*t)/100);
		return model;
	}
}
