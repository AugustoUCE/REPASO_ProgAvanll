package com.uce.edu.ec.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.ec.repository.ICitaMedicaRepo;
import com.uce.edu.ec.repository.modelo.CitaMedica;


@Service
public class CitaMedicaServImpl implements ICitaMedicaServ {

	@Autowired
	private ICitaMedicaRepo citaMedicaRepo;

	@Override
	public CitaMedica buscar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		return this.citaMedicaRepo.seleccionar(citaMedica);
	}

	@Override
	public void guardar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.citaMedicaRepo.ingresar(citaMedica);
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.citaMedicaRepo.actualizar(citaMedica);
	}

	@Override
	public void agendamiento(Integer numeroTurno, LocalDateTime fechaCita, BigDecimal costo, String lugar,
			String cedulaDoctor, String cedulaPaciente) {
		// TODO Auto-generated method stub
		this.citaMedicaRepo.agendamiento(numeroTurno, fechaCita, costo, lugar, cedulaDoctor, cedulaPaciente);
	}

	@Override
	public CitaMedica buscarPorTurno(Integer numeroTurno) {
		// TODO Auto-generated method stub
		return this.citaMedicaRepo.buscarPorTurno(numeroTurno);
	}

	@Override
	public void actulizarcita(Integer numeroTurno, String diagnostico, String receta, LocalDateTime fechaControl) {
		// TODO Auto-generated method stub
		this.citaMedicaRepo.actulizarcita(numeroTurno, diagnostico, receta, fechaControl);
		
	}

}
