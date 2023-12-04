package com.uce.edu.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.banco.repository.modelo.CuentaBancaria;
import com.uce.edu.banco.repository.modelo.Transferencia;
@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {
	private List<Transferencia> base = new ArrayList<Transferencia>();
	@Override
	public Transferencia seleccionar(String id) {
		for (Transferencia transferencia : base) {
			if (transferencia.getId().equals(id)) {
				Transferencia tra = new Transferencia();
				tra.setId(transferencia.getId());
				tra.setComision(transferencia.getComision());
				tra.setFecha(transferencia.getFecha());
				tra.setMonto(transferencia.getMonto());
				
				return transferencia;
			}
		}
		return null;
	}

	@Override
	public void insertar(Transferencia transferencia) {
		base.add(transferencia);

	}

	@Override
	public void actualizar(Transferencia transferencia) {
		this.eliminar(transferencia.getId());
		this.insertar(transferencia);

	}

	@Override
	public void eliminar(String id) {
		base.remove(this.seleccionar(id));

	}

}
