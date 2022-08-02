package com.facundotorrez.pruebatecnca.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	
	@GetMapping({"/index","/home","/"})
	public String inicio() {
		return "/home";
	}

}
