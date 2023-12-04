package com.uce.edu.sistema.vehicular.repository;

import com.uce.edu.sistema.vehicular.repository.modelo.Vehiculo;

public interface IVehiculoRep {

	public Vehiculo seleccionar(String placa);

	public void insertar(Vehiculo vehiculo);

	public void actualizar(Vehiculo vehiculo);

	public void eliminar(String placa);

}
