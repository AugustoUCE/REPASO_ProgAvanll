package com.uce.edu.banco.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transferencia {
	private String id;
	private LocalDateTime fecha;
	private BigDecimal monto;
	private BigDecimal comision;
	private CuentaBancaria cuentaO;
	private CuentaBancaria cuentaD;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public BigDecimal getComision() {
		return comision;
	}
	public void setComision(BigDecimal comision) {
		this.comision = comision;
	}
	public CuentaBancaria getCuentaO() {
		return cuentaO;
	}
	public void setCuentaO(CuentaBancaria cuentaO) {
		this.cuentaO = cuentaO;
	}
	public CuentaBancaria getCuentaD() {
		return cuentaD;
	}
	public void setCuentaD(CuentaBancaria cuentaD) {
		this.cuentaD = cuentaD;
	}
	@Override
	public String toString() {
		return "Transferencia [id=" + id + ", fecha=" + fecha + ", monto=" + monto + ", comision=" + comision
				+ ", cuentaO=" + cuentaO + ", cuentaD=" + cuentaD + "]";
	}
	
	
}
