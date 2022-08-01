package com.facundotorrez.pruebatecnca.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.facundotorrez.pruebatecnca.models.Dueño;

public interface IDueñoService {
	public List<Dueño>listar();
	public Optional<Dueño>traerId(int id);
	
		
	

}
