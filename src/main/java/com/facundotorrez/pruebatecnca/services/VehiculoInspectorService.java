package com.facundotorrez.pruebatecnca.services; 

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facundotorrez.pruebatecnca.interfaceServices.IVehiculoInspectorService;
import com.facundotorrez.pruebatecnca.models.Dueño;
import com.facundotorrez.pruebatecnca.models.VehiculoInspector;
import com.facundotorrez.pruebatecnca.repositories.IVehiculoInspectorRepository;

@Service
public class VehiculoInspectorService implements IVehiculoInspectorService{
	@Autowired
	
	private IVehiculoInspectorRepository vehiculoInspectorRepository;

	@Override
	public List<VehiculoInspector> list() {
		// TODO Auto-generated method stub
		return vehiculoInspectorRepository.findAll();
	}

	@Override
	public Optional<VehiculoInspector> traerById(int id) {
		// TODO Auto-generated method stub
		return vehiculoInspectorRepository.findById(id);
	}

	@Override
	public List<VehiculoInspector> traerInspeccionesPorIdDueño(int idDueño) {
		// TODO Auto-generated method stub
		return vehiculoInspectorRepository.findInspeccionByIdDueño(idDueño);
	}
	
	

	


}
