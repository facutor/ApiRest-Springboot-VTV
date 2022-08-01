package com.facundotorrez.pruebatecnca.models;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="dueños")
public class Dueño {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int idDueño;
	
	@Column(name="nombre", nullable=false, length=45)
	private String nombre;
	
	@Column(name="apellido", nullable=false, length=45)
	private String apellido;
	
	@Column(name="dni", nullable=false)
	private long dni;
	
	@Column(name="createdat")
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@Column(name="updatedat")
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	
	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER, mappedBy="dueño")
	private Set<Vehiculo> vehiculos;
	
	@Column(name="tipo_dueño", nullable = false )
    @Enumerated(value = EnumType.ORDINAL)
	private TipoDueño tipoDueño;
	
	public enum TipoDueño{
		COMUN,
		EXENTO,
	}

	public Dueño() {
		super();
	}

	
	
	
	
	
	
	

}
