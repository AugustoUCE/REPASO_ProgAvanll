package com.uce.edu.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.banco.repository.ICuentaRepository;
import com.uce.edu.banco.repository.modelo.CuentaBancaria;
@Service
public class CuentaServiceImpl implements ICuentaService {
	@Autowired
	private ICuentaRepository cuentaRepository;
	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return this.cuentaRepository.seleccionar(numero);
	}

	@Override
	public void guardar(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.cuentaRepository.insertar(bancaria);
	}

	@Override
	public void actualizar(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.cuentaRepository.actualizar(bancaria);
	}

	@Override
	public void borrar(String numero) {
		// TODO Auto-generated method stub
		this.cuentaRepository.eliminar(numero);
	}

}

