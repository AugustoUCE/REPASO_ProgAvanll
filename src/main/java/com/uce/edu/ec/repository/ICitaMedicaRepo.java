package com.uce.edu.ec.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.ec.repository.modelo.CitaMedica;

public interface ICitaMedicaRepo {

	public CitaMedica seleccionar(CitaMedica citaMedica);

	public void ingresar(CitaMedica citaMedica);

	public void actualizar(CitaMedica citaMedica);
	
	public void agendamiento(Integer numeroTurno,LocalDateTime fechaCita,BigDecimal costo,String lugar,String cedulaDoctor,String cedulaPaciente);

	public CitaMedica buscarPorTurno(Integer numeroTurno);
	
	public void actulizarcita(Integer numeroTurno,String diagnostico,String receta,LocalDateTime fechaControl);
	

}
