package com.uce.edu.ec.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_doctor")
	@SequenceGenerator(name = "seq_doctor", sequenceName = "seq_doctor", allocationSize = 1)
	@Column(name="doct_id")
	private Integer id;
	@Column(name="doct_cedula")
	private String cedula;
	@Column(name="doct_nombre")
	private String nombre;
	@Column(name="doct_apellido")
	private String apellido;
	@Column(name="doct_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	@Column(name="doct_numero_consultorio")
	private String numeroConsultorio;
	@Column(name="doct_titulo")
	private String titulo;
	@Column(name="doct_salario")
	private BigDecimal salario;
	
	@OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<CitaMedica> citaMedicas;

	//set get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNumeroConsultorio() {
		return numeroConsultorio;
	}

	public void setNumeroConsultorio(String numeroConsultorio) {
		this.numeroConsultorio = numeroConsultorio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public List<CitaMedica> getCitaMedicas() {
		return citaMedicas;
	}

	public void setCitaMedicas(List<CitaMedica> citaMedicas) {
		this.citaMedicas = citaMedicas;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", numeroConsultorio=" + numeroConsultorio + ", titulo="
				+ titulo + ", salario=" + salario + ", getId()=" + getId() + ", getCedula()=" + getCedula()
				+ ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido() + ", getFechaNacimiento()="
				+ getFechaNacimiento() + ", getNumeroConsultorio()=" + getNumeroConsultorio() + ", getTitulo()="
				+ getTitulo() + ", getSalario()=" + getSalario() + ", getCitaMedicas()=" + getCitaMedicas()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


	
	
	

}
