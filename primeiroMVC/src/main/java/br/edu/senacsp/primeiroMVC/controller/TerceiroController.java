package br.edu.senacsp.primeiroMVC.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TerceiroController {

	@RequestMapping(
			value="/soma/{num1}/{num2}", method=RequestMethod.GET)
	public String soma(@PathVariable(value="num1") String num1, 
					   @PathVariable(value="num2") String num2) {
		try {
			double soma = Double.parseDouble(num1) + Double.parseDouble(num2);
			
			return Double.toString(soma);
			
		}catch(Exception e){
			

			return erro();
		}		
	}
	
	
	@RequestMapping()
	public String erro() {
		return "Não deu bom";
	}
	
}
