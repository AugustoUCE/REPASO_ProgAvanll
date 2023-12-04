package com.uce.edu.sistema.vehicular.service;

import com.uce.edu.sistema.vehicular.repository.modelo.Propietario;

public interface IPropietarioServ {

	public Propietario buscar(String cedula);

	public void guardar(Propietario propietario);

	public void actulizar(Propietario propietario);

	public void eliminar(String cedula);

}
