package com.uce.edu.ec.repository;

import com.uce.edu.ec.repository.modelo.Paciente;

public interface IPacienteRepo {
	
	public void ingresar(Paciente paciente);
	public Paciente seleccionarPorCedula(String cedula);

}
