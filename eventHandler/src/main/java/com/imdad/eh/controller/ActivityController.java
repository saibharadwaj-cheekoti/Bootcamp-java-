package com.imdad.eh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imdad.eh.model.Activity;

@Controller
public class ActivityController {
	
	@RequestMapping(value="/greeting")
	public String getWelcomeMessage(Model model){
		
		model.addAttribute("msg","Hi Spring you are welcome");
		return "welcome";
	}
	
	@RequestMapping(value="/addActivity")
	public String addActivity(@ModelAttribute("activities") Activity activity){
		
		System.out.println(activity.getActivityName());
		if(activity.getActivityName()==null){
			return "addActivity";
		}
		else{
		return "redirect:addSubActivity.html";
		}
	}
	
	@RequestMapping(value="/addSubActivity")
	public String addSubActivity(@ModelAttribute("activities") Activity activity){
		
		System.out.println("Sub activity is "+activity.getActivityName());
		return "addActivity";
	}
	
}
