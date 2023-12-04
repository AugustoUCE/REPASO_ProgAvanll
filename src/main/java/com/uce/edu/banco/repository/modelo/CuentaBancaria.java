package com.uce.edu.banco.repository.modelo;

import java.math.BigDecimal;

public class CuentaBancaria {
	private String numero;
	private String tipo;
	private BigDecimal Saldo;
	private String cedulaPropietario;
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public BigDecimal getSaldo() {
		return Saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		Saldo = saldo;
	}
	public String getCedulaPropietario() {
		return cedulaPropietario;
	}
	public void setCedulaPropietario(String cedulaPropietario) {
		this.cedulaPropietario = cedulaPropietario;
	}
	@Override
	public String toString() {
		return "CuentaBancaria [numero=" + numero + ", tipo=" + tipo + ", Saldo=" + Saldo + ", cedulaPropietario="
				+ cedulaPropietario + "]";
	}
	
}
