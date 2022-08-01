package com.facundotorrez.pruebatecnca.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.facundotorrez.pruebatecnca.models.VehiculoInspector;
@Repository
public interface IVehiculoInspectorRepository extends JpaRepository<VehiculoInspector, Serializable>{
	@Query("SELECT  i FROM VehiculoInspector i JOIN FETCH i.vehiculo JOIN FETCH i.inspector")
	List<VehiculoInspector> listarInspecciones();
	
	@Query("SELECT i FROM VehiculoInspector i JOIN FETCH i.vehiculo v where v.dueño.idDueño=(:idDueño)")
	public List<VehiculoInspector> findInspeccionByIdDueño(@Param("idDueño")int idDueño);

}
