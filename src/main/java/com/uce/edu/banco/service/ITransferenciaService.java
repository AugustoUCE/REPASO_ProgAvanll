package com.uce.edu.banco.service;

import java.math.BigDecimal;

import com.uce.edu.banco.repository.modelo.Transferencia;

public interface ITransferenciaService {
	public Transferencia buscar(String id);
	public void guardar(Transferencia transferencia);
	public void actualizar(Transferencia transferencia);
	public void borrar(String id);
	public void realizar(String cuentaO, String cuentaD, BigDecimal monto);
}
