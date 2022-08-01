package com.facundotorrez.pruebatecnca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.facundotorrez.pruebatecnca.interfaceServices.IVehiculoInspectorService;
import com.facundotorrez.pruebatecnca.models.Dueño;
import com.facundotorrez.pruebatecnca.models.VehiculoInspector;

@Controller
@RequestMapping("/inspecciones")
public class VehiculoInspectorController {
	
	@Autowired
	private IVehiculoInspectorService vhService;
	
	@GetMapping("/lista")
	public ResponseEntity<?> traerInspecciones(){
		List<VehiculoInspector> inspecciones= vhService.list();
		return new ResponseEntity<List<VehiculoInspector>>(inspecciones,HttpStatus.OK);
	}
	@GetMapping("/lista/{idDueño}")
	public ResponseEntity<?>traerInspeccionesIdDueño(@PathVariable(name="idDueño") int idDueño){
		List<VehiculoInspector> inspeccionBuscada = vhService.traerInspeccionesPorIdDueño(idDueño);
		if(inspeccionBuscada.isEmpty()) {
			return new ResponseEntity<String>("El dueño buscado no existe", HttpStatus.NOT_FOUND);
		} else return new ResponseEntity<List<VehiculoInspector>>(inspeccionBuscada, HttpStatus.FOUND);
		
	}

}
