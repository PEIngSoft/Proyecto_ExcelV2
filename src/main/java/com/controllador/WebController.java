package com.controllador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

	@GetMapping("/loggin")
	public String loggin(@RequestParam(name="log-reg", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("log-reg", name);
		return "log-reg";
	}
	
	@GetMapping("/index")
	public String register(@RequestParam(name="index", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("index", name);
		return "index";
	}
}
