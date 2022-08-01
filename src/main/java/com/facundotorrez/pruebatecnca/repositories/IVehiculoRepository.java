package com.facundotorrez.pruebatecnca.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facundotorrez.pruebatecnca.models.Vehiculo;

public interface IVehiculoRepository extends JpaRepository<Vehiculo, Serializable>{

}
