package com.uce.edu.ec.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.edu.ec.repository.modelo.CitaMedica;
import com.uce.edu.ec.repository.modelo.Doctor;
import com.uce.edu.ec.repository.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CitaMedicaRepoImpl implements ICitaMedicaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	

	@Override
	public CitaMedica seleccionar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CitaMedica.class, citaMedica);
	}

	@Override
	public void ingresar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(citaMedica);
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.merge(citaMedica);

	}

	@Override
	public void agendamiento(Integer numeroTurno, LocalDateTime fechaCita, BigDecimal costo, String lugar,
			String cedulaDoctor, String cedulaPaciente) {
		// TODO Auto-generated method stub
		CitaMedica c = new CitaMedica();
		c.setNumeroTurno(numeroTurno);
		c.setFecha(fechaCita);
		c.setCosto(costo);
		c.setLugar(lugar);
		Doctor d =new Doctor();
		d.setCedula(cedulaDoctor);
	
		Paciente p = new Paciente();
		p.setCedula(cedulaPaciente);

		this.ingresar(c);
		
	}

	@Override
	public CitaMedica buscarPorTurno(Integer numeroTurno) {
		// TODO Auto-generated method stub
		String jpql="SELECT c FROM CitaMedica c WHERE c.numeroTurno =: var";
		Query myQuery=this.entityManager.createQuery(jpql);
		myQuery.setParameter("var", numeroTurno);
		return (CitaMedica) myQuery.getSingleResult();
	}

	@Override
	public void actulizarcita(Integer numeroTurno, String diagnostico, String receta, LocalDateTime fechaControl) {
		// TODO Auto-generated method stub
		CitaMedica citaAct = this.buscarPorTurno(numeroTurno);
		citaAct.setDiagnostico(diagnostico);
		citaAct.setReceta(receta);
		citaAct.setFechaControl(fechaControl);
		
		this.actualizar(citaAct);
		
	}
}
