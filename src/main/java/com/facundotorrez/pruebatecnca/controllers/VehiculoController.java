package com.facundotorrez.pruebatecnca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.facundotorrez.pruebatecnca.interfaceServices.IVehiculoService;
import com.facundotorrez.pruebatecnca.models.Vehiculo;

@RequestMapping("/vehiculos")
@Controller
public class VehiculoController {
	@Autowired
	private IVehiculoService vehiculoService;
	
	@GetMapping("/lista")
	public ResponseEntity<?> traerVehiculos(){
		List<Vehiculo> listaVehiculos = vehiculoService.listar();
		return new ResponseEntity<List<Vehiculo>>(listaVehiculos, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> traerVehiculoId(@PathVariable(name="id") int id){		
		java.util.Optional<Vehiculo> vehiculoBuscado = vehiculoService.listarId(id);
		if(vehiculoBuscado.isEmpty()) {
			return new ResponseEntity<String>("El vehiculo buscado no existe", HttpStatus.NOT_FOUND);
		} else return new ResponseEntity<Vehiculo>(vehiculoBuscado.get(), HttpStatus.FOUND);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<?> eliminarUsuario(@PathVariable("id")int id) throws Exception{
			vehiculoService.delete(id);
			return new ResponseEntity<String>("El vehiculo con id="+id+" fue eliminado", HttpStatus.OK);
	}
	@PostMapping("/agregar")
	public ResponseEntity<?> nuevoVehiculo(@RequestBody Vehiculo vehiculo) throws Exception{
		java.util.Optional<Vehiculo> v = vehiculoService.listarDominio(vehiculo.getDominio());
		if(v.isEmpty()) {
			return new ResponseEntity<Vehiculo>(vehiculoService.saveOrUpdate(vehiculo), HttpStatus.CREATED);
		}else {
			return new ResponseEntity<String>("El vehiculo ingresado ya exite", HttpStatus.OK);
		}
		
		
	}@PutMapping("/actualizar/{id}")
	public ResponseEntity<?> actualizarUsuario(@RequestBody Vehiculo vehiculo, @PathVariable(name = "id") int id) throws Exception{
	
		java.util.Optional<Vehiculo> v =vehiculoService.listarId(id);
		if(v.isEmpty()) {
			return new ResponseEntity<String>("Este vehiculo no existe", HttpStatus.BAD_REQUEST);
		}else {
			vehiculo.setIdVehiculo(id);
			return new ResponseEntity<Vehiculo>(vehiculoService.saveOrUpdate(vehiculo), HttpStatus.OK);
		}
	}

}