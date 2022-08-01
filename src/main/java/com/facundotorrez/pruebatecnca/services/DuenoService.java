package com.facundotorrez.pruebatecnca.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facundotorrez.pruebatecnca.interfaceServices.IDueñoService;
import com.facundotorrez.pruebatecnca.models.Dueño;
import com.facundotorrez.pruebatecnca.repositories.IDueñoRepository;
@Service
public class DuenoService implements IDueñoService {
	@Autowired
	
	private IDueñoRepository dueñoRepository;

	@Override
	public List<Dueño> listar() {
		// TODO Auto-generated method stub
		return dueñoRepository.findAll();
	}

	@Override
	public Optional<Dueño> traerId(int id) {
		// TODO Auto-generated method stub
		return dueñoRepository.findById(id);
	}

}
