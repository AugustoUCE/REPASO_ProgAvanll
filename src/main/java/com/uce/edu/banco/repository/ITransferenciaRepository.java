package com.uce.edu.banco.repository;

import com.uce.edu.banco.repository.modelo.Transferencia;

public interface ITransferenciaRepository {
	public Transferencia seleccionar(String id);
	public void insertar(Transferencia transferencia);
	public void actualizar(Transferencia transferencia);
	public void eliminar(String id);
}
