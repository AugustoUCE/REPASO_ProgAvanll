package com.uce.edu.banco.service;

import com.uce.edu.banco.repository.modelo.CuentaBancaria;

public interface ICuentaService {
	public CuentaBancaria buscar(String numero);
	public void guardar(CuentaBancaria bancaria);
	public void actualizar(CuentaBancaria bancaria);
	public void borrar(String numero);
}
