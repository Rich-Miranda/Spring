package br.edu.senacsp.primeiroMVC.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SegundoController {
	private static final String template = "Olá, %s";
	
	private static AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/saudacao")
	public Saudacao saudacao(
			@RequestParam(value = "nome", defaultValue = "Mundo") String nome) {
		return new Saudacao(counter.incrementAndGet(), String.format(template, nome));
	}
}
