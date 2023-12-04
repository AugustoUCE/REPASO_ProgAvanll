package com.uce.edu.sistema.vehicular.repository;

import com.uce.edu.sistema.vehicular.repository.modelo.Propietario;

public interface IPropietarioRep {

	public Propietario seleccionar(String cedula);

	public void insertar(Propietario propietario);

	public void actulizar(Propietario propietario);

	public void eliminar(String cedula);

}
