package com.uce.edu.ec.repository;

import com.uce.edu.ec.repository.modelo.Doctor;

public interface IDoctorRepo {
	
	public void ingresar(Doctor doctor);
	
	public Doctor seleccionarPorCedula(String cedula);

}
