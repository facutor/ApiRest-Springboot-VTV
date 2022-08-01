package com.facundotorrez.pruebatecnca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.facundotorrez.pruebatecnca.interfaceServices.IDueñoService;
import com.facundotorrez.pruebatecnca.models.Dueño;

@RequestMapping("/dueño")
@Controller
public class DueñoController {
	@Autowired
	private IDueñoService dueñoService;
	
	@GetMapping("/lista")
	public ResponseEntity<?> traerDueños(){
		List<Dueño> lDueños= dueñoService.listar();
		return new ResponseEntity<List<Dueño>>(lDueños,HttpStatus.OK);
	}

}
