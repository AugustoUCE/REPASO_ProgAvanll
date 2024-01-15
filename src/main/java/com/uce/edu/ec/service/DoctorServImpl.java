package com.uce.edu.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.ec.repository.IDoctorRepo;
import com.uce.edu.ec.repository.modelo.Doctor;

@Service
public class DoctorServImpl implements IDoctorServ {

	@Autowired
	private IDoctorRepo doctorRepo;
	
	@Override
	public void guardar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepo.ingresar(doctor);
	}

	@Override
	public Doctor buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.doctorRepo.seleccionarPorCedula(cedula);
	}

}
