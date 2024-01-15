package com.uce.edu.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.ec.repository.IPacienteRepo;
import com.uce.edu.ec.repository.modelo.Paciente;

@Service
public class PacienteServImpl implements IPacienteServ {

	@Autowired
	private IPacienteRepo pacienteRepo;

	@Override
	public void guardar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepo.ingresar(paciente);
	}

	@Override
	public Paciente buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.pacienteRepo.seleccionarPorCedula(cedula);
	}

}
