package com.uce.edu.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.banco.repository.ICuentaRepository;
import com.uce.edu.banco.repository.ITransferenciaRepository;
import com.uce.edu.banco.repository.modelo.CuentaBancaria;
import com.uce.edu.banco.repository.modelo.Transferencia;
@Service
public class TransferenciaServiceImpl implements ITransferenciaService {
	@Autowired
	private ITransferenciaRepository transferenciaRepository;
	@Autowired
	private ICuentaRepository cuentaRepository;
	@Override
	public Transferencia buscar(String id) {
		// TODO Auto-generated method stub
		return this.transferenciaRepository.seleccionar(id);
	}

	@Override
	public void guardar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.insertar(transferencia);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.actualizar(transferencia);
	}

	@Override
	public void borrar(String id) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.eliminar(id);
	}

	@Override
	public void realizar(String cuentaO, String cuentaD, BigDecimal monto) {
		
		//cuentaorigen
		CuentaBancaria ctaO = this.cuentaRepository.seleccionar(cuentaO);
		if(ctaO.getSaldo().compareTo(monto)>0) {
		BigDecimal montoO =ctaO.getSaldo().subtract(monto);
		BigDecimal comisionMOnto = monto.multiply(new BigDecimal(0.05));
		ctaO.setSaldo(montoO.subtract(comisionMOnto));
		this.cuentaRepository.actualizar(ctaO);
		//cuentadestino
		CuentaBancaria ctaD = this.cuentaRepository.seleccionar(cuentaD);
		BigDecimal montoD = ctaD.getSaldo().add(monto);
		ctaD.setSaldo(montoD);
		this.cuentaRepository.actualizar(ctaD);
		
		//registro transferencia
		
		Transferencia trans = new Transferencia();
		trans.setComision(comisionMOnto);
		trans.setFecha(LocalDateTime.now());
		trans.setId("2");
		trans.setMonto(monto);
		trans.setCuentaO(ctaO);
		trans.setCuentaD(ctaD);
		this.transferenciaRepository.actualizar(trans);
		}else {
			System.out.println("no se puede gil");
		}
		
	}

}
