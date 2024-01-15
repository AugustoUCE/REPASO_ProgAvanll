package com.uce.edu.ec;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ec.repository.modelo.CitaMedica;
import com.uce.edu.ec.repository.modelo.Doctor;
import com.uce.edu.ec.repository.modelo.Paciente;
import com.uce.edu.ec.service.ICitaMedicaServ;
import com.uce.edu.ec.service.IDoctorServ;
import com.uce.edu.ec.service.IPacienteServ;

@SpringBootApplication
public class RepasoUnidad2Application implements CommandLineRunner{
	
	@Autowired
	private IDoctorServ doctorServ;
	@Autowired
	private IPacienteServ pacienteServ;
	
	@Autowired
	private ICitaMedicaServ citaMedicaServ;

	public static void main(String[] args) {
		SpringApplication.run(RepasoUnidad2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Doctor d = new Doctor();
		d.setApellido("Salazar");
		d.setCedula("123");
		d.setFechaNacimiento(LocalDateTime.now());
		d.setNombre("Augustp");
		d.setNumeroConsultorio("C1");
		d.setSalario(null);
		d.setTitulo(null);
		
		
		Paciente p = new Paciente();
		p.setApellido("lala");
		p.setCedula("456");
		p.setCodigoIess("12");
		p.setEstatura(null);
		p.setFechaNacimiento(LocalDateTime.now());
		p.setGenero("m");
		p.setNombre("jhon");
		p.setPeso(null);
		
		Paciente p1 = new Paciente();
		p1.setApellido("alvarez");
		p1.setCedula("456");
		p1.setCodigoIess("12");
		p1.setEstatura(null);
		p1.setFechaNacimiento(LocalDateTime.now());
		p1.setGenero("m");
		p1.setNombre("jhon");
		p1.setPeso(null);
		
		CitaMedica cm =new CitaMedica();
		cm.setCosto(null);
		cm.setDiagnostico("enfermo");
		cm.setFecha(LocalDateTime.of(2024, 1,9, 7, 53));
		cm.setFechaControl(null);
		cm.setLugar(null);
		cm.setNumeroTurno(null);
		cm.setReceta(null);
		cm.setDoctor(d);
		cm.setPaciente(p);
		
		
		CitaMedica cm1 =new CitaMedica();
		cm1.setCosto(null);
		cm1.setDiagnostico("enfermo");
		cm1.setFecha(LocalDateTime.of(2024, 1,9, 7, 53));
		cm1.setFechaControl(null);
		cm1.setLugar(null);
		cm1.setNumeroTurno(null);
		cm1.setReceta(null);
		cm1.setDoctor(d);
		cm1.setPaciente(p1);
		
		List<CitaMedica> citaMedicas = new ArrayList<>();
		citaMedicas.add(cm);
		citaMedicas.add(cm1);
		
		d.setCitaMedicas(citaMedicas);
		
		
		//this.doctorServ.guardar(d);
		
		this.citaMedicaServ.agendamiento(10, LocalDateTime.now(), new BigDecimal(10), "puengasi", "123", "456");
		
	//	CitaMedica cita =this.citaMedicaServ.buscarPorTurno(7);
	//	System.out.println(cita);
		
	//	this.citaMedicaServ.actulizarcita(7, "sano", "cuidarse", LocalDateTime.now());
		
		
	}

}
