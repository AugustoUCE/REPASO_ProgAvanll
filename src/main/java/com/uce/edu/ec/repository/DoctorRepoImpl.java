package com.uce.edu.ec.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.ec.repository.modelo.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DoctorRepoImpl implements IDoctorRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(doctor);
	}

	@Override
	public Doctor seleccionarPorCedula(String cedula) {
		// TODO Auto-generated method stub
	
		String jpql="SELECT d FROM Doctor d WHERE d.cedula =: var";
		Query myQuery =this.entityManager.createQuery(jpql);
		myQuery.setParameter("var", cedula);
		
		return (Doctor) myQuery.getSingleResult();
	
	}

}
