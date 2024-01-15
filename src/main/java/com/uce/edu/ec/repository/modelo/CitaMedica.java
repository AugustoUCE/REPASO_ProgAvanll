package com.uce.edu.ec.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cita_medica")
public class CitaMedica {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cita_medica")
	@SequenceGenerator(name = "seq_cita_medica", sequenceName = "seq_cita_medica", allocationSize = 1)
	@Column(name="cime_id")
	private Integer id;
	@Column(name="cime_numero_turno")
	private Integer numeroTurno;
	@Column(name="cime_fecha")
	private LocalDateTime fecha;
	@Column(name="cime_costo")
	private BigDecimal costo;
	@Column(name="cime_lugar")
	private String lugar;
	@Column(name="cime_diagnostico")
	private String diagnostico;
	@Column(name="cime_receta")
	private String receta;
	@Column(name="cime_fecha_control")
	private LocalDateTime fechaControl;
	
	@ManyToOne
	@JoinColumn(name="cita_id_doctor")
	private Doctor doctor;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cita_id_paciente")
	private Paciente paciente;

	//set get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroTurno() {
		return numeroTurno;
	}

	public void setNumeroTurno(Integer numeroTurno) {
		this.numeroTurno = numeroTurno;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getCosto() {
		return costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getReceta() {
		return receta;
	}

	public void setReceta(String receta) {
		this.receta = receta;
	}

	public LocalDateTime getFechaControl() {
		return fechaControl;
	}

	public void setFechaControl(LocalDateTime fechaControl) {
		this.fechaControl = fechaControl;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		return "CitaMedica [id=" + id + ", numeroTurno=" + numeroTurno + ", fecha=" + fecha + ", costo=" + costo
				+ ", lugar=" + lugar + ", diagnostico=" + diagnostico + ", receta=" + receta + ", fechaControl="
				+ fechaControl + ", doctor=" + doctor + ", paciente=" + paciente + "]";
	}
	

	
	
	
	
	

}
