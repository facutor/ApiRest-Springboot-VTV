package com.facundotorrez.pruebatecnca.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.facundotorrez.pruebatecnca.models.Dueño;
import com.facundotorrez.pruebatecnca.models.VehiculoInspector;

public interface IVehiculoInspectorService  {
	public List<VehiculoInspector>list();
	public Optional<VehiculoInspector>traerById(int id);
}
