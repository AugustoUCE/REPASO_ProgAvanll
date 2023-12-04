package com.uce.edu;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.banco.repository.modelo.CuentaBancaria;
import com.uce.edu.banco.service.ICuentaService;
import com.uce.edu.banco.service.ITransferenciaService;
import com.uce.edu.sistema.vehicular.repository.IMatriculaRep;
import com.uce.edu.sistema.vehicular.repository.IVehiculoRep;
import com.uce.edu.sistema.vehicular.repository.modelo.Matricula;
import com.uce.edu.sistema.vehicular.repository.modelo.Propietario;
import com.uce.edu.sistema.vehicular.repository.modelo.Vehiculo;
import com.uce.edu.sistema.vehicular.service.IMatriculaServ;
import com.uce.edu.sistema.vehicular.service.IPropietarioServ;
import com.uce.edu.sistema.vehicular.service.IVehiculoServ;

@SpringBootApplication
public class RepasoUnidad1Application implements CommandLineRunner {

	@Autowired
	private IVehiculoServ vehiculoServ;
	@Autowired
	private IPropietarioServ propietarioServ;
	@Autowired
	private IMatriculaServ matriculaServ;
	@Autowired
	private ITransferenciaService transferenciaService;
	@Autowired
	private ICuentaService cuentaService;

	public static void main(String[] args) {
		SpringApplication.run(RepasoUnidad1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//
//		Vehiculo v = new Vehiculo();
//
//		v.setMarca("nissan");
//		v.setPlaca("pdt2074");
//		v.setPrecio(new BigDecimal(5000));
//		v.setTipo("LIVIANO");
//		this.vehiculoServ.guardar(v);
//		System.out.println(this.vehiculoServ.buscar("pdt2074"));
//
//		Propietario p = new Propietario();
//
//		p.setNombre("Augusto");
//		p.setApellido("Salazar");
//		p.setCedula("1752083905");
//		p.setFechaNacimiento(LocalDateTime.now());
//		this.propietarioServ.guardar(p);
//		System.out.println(this.propietarioServ.buscar("1752083905"));
//
//		this.matriculaServ.matricula("1752083905", "pdt2074");
//		System.out.println(this.matriculaServ.buscar("m1"));
//
//		List<Matricula> list = this.matriculaServ.buscarTodo();
//		for (Matricula matricula : list) {
//			System.out.println("reporte: " + list);
//
//		}
		
		CuentaBancaria ctao = new CuentaBancaria();
		ctao.setCedulaPropietario("1");
		ctao.setNumero("82");	
		ctao.setSaldo(new BigDecimal(10));
		ctao.setTipo("corriente");
		this.cuentaService.guardar(ctao);
		CuentaBancaria ctad = new CuentaBancaria();
		ctad.setCedulaPropietario("2");
		ctad.setNumero("69");	
		ctad.setSaldo(new BigDecimal(100));
		ctad.setTipo("ahorros");
		this.cuentaService.guardar(ctad);
		this.transferenciaService.realizar("82", "69", new BigDecimal(50));
		System.out.println(this.transferenciaService.buscar("2"));

	}

}
