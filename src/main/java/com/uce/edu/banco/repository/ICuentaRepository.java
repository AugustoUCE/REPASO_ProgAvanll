package com.uce.edu.banco.repository;

import com.uce.edu.banco.repository.modelo.CuentaBancaria;

public interface ICuentaRepository {
	public CuentaBancaria seleccionar(String numero);
	public void insertar(CuentaBancaria bancaria);
	public void actualizar(CuentaBancaria bancaria);
	public void eliminar(String numero);
}
