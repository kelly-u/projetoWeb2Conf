package br.com.ifpe.projconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class projetoController {

	@RequestMapping("home")
	public String hi() {
		System.out.println("Hiiiii");
		return "hello";
	}
}
