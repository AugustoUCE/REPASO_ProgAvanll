package com.uce.edu.ec.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.ec.repository.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PacienteRepoImpl implements IPacienteRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(paciente);
	}

	@Override
	public Paciente seleccionarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		String jpql="SELECT p FROM Paciente p WHERE p.cedula =: var";
		Query myQuery=this.entityManager.createQuery(jpql);
		myQuery.setParameter("var", cedula);
		
	return (Paciente) myQuery.getSingleResult();	
	}

}
