package com.collection4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	
	List<Userdetails> list = new ArrayList<Userdetails>();
	
	@RequestMapping("/registerSuccess")
	public String newusers(@RequestParam("usname") String unm,@RequestParam("uspwd") String pwd,@RequestParam("usmail") String mail) {
		Userdetails user = new Userdetails(unm,pwd,mail);
		list.add(user);
		return "redirect:/login";
	}
	
	@RequestMapping("/login")
	public ModelAndView tryagain(@ModelAttribute("user1") Userdetails user1) {
		
		ModelAndView model = new ModelAndView("login4");
		model.addObject(user1);
		return model;
		
	}
	
	@RequestMapping("/Authdetails")
	public ModelAndView getvalues(@ModelAttribute("user1") Userdetails user1) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getUsname().equals(user1.usname) && list.get(i).getUspwd().equals(user1.uspwd)) {
				ModelAndView model = new ModelAndView("success4");
				model.addObject(user1);
				return model;
				}else {
					ModelAndView model = new ModelAndView("Error");
					model.addObject(user1);
					return model;
				}
		}
		return null;
		
	}
}