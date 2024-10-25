package br.edu.senacsp.primeiroMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


import jakarta.servlet.http.HttpServletRequest;

@Controller
public class PrimeiroController {
	
	
	@GetMapping("/primeiro")
	public String primeiro() {
		return "hello";
	}
	
	@GetMapping("/ola")
	public String ola(HttpServletRequest request) {
		request.setAttribute("nome", "João");
		return "helo";
	}
	
	@GetMapping("/oi")
	public ModelAndView oi() {
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject("nome", "João");
		return mv;
	}
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("nome", "Alexandre");
		return "hello";
	}
	
	
	
	
	
	
	
	
	
	
}
