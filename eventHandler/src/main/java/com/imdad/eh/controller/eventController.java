package com.imdad.eh.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.imdad.eh.model.Event;

@Controller
@SessionAttributes("event")
public class eventController {

	@RequestMapping(value = "/addEvent", method = RequestMethod.POST)
	public String addEvent(@Valid @ModelAttribute("event") Event event, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "addEvent";
		} else {
			return "redirect:addActivity.html";
		}
	}

	@RequestMapping(value = "/addEvent", method=RequestMethod.GET)
	public String getEvent(Model model) {
		Event event = new Event();
		event.setEventName("Birthday");
		model.addAttribute("event", event);
		return "addEvent";

	}

}
