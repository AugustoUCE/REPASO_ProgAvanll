package com.uce.edu.ec.service;

import com.uce.edu.ec.repository.modelo.Doctor;

public interface IDoctorServ {
	
	public void guardar(Doctor doctor);
	
	public Doctor buscarPorCedula(String cedula);

}
