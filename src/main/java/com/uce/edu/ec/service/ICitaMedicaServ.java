package com.uce.edu.ec.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.ec.repository.modelo.CitaMedica;

public interface ICitaMedicaServ {
	
	public CitaMedica buscar(CitaMedica citaMedica);

	public void guardar(CitaMedica citaMedica);

	public void actualizar(CitaMedica citaMedica);
	
	
	public void agendamiento(Integer numeroTurno,LocalDateTime fechaCita,BigDecimal costo,String lugar,String cedulaDoctor,String cedulaPaciente);

	public CitaMedica buscarPorTurno(Integer numeroTurno);
	public void actulizarcita(Integer numeroTurno,String diagnostico,String receta,LocalDateTime fechaControl);
	

}
