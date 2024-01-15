package com.uce.edu.ec.service;

import com.uce.edu.ec.repository.modelo.Paciente;

public interface IPacienteServ {

	public void guardar(Paciente paciente);
	public Paciente buscarPorCedula(String cedula);
	
}
