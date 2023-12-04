package com.uce.edu.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.banco.repository.modelo.CuentaBancaria;
@Repository
public class CuentaRepositoryImpl implements  ICuentaRepository{
	private List<CuentaBancaria> base = new ArrayList<CuentaBancaria>();
	@Override
	public CuentaBancaria seleccionar(String numero) {
		for (CuentaBancaria cuentaBancaria : base) {
			if (cuentaBancaria.getNumero().equals(numero)) {
				CuentaBancaria cta = new CuentaBancaria();
				cta.setCedulaPropietario(cuentaBancaria.getCedulaPropietario());
				cta.setNumero(cuentaBancaria.getNumero());
				cta.setSaldo(cuentaBancaria.getSaldo());
				cta.setTipo(cuentaBancaria.getTipo());
				
				return cuentaBancaria;
			}
		}
		return null;
	}

	@Override
	public void insertar(CuentaBancaria bancaria) {
		base.add(bancaria);
		
	}

	@Override
	public void actualizar(CuentaBancaria bancaria) {
		this.eliminar(bancaria.getNumero());
		this.insertar(bancaria);
		
	}

	@Override
	public void eliminar(String numero) {
		base.remove(this.seleccionar(numero));
		
		
	}

}
