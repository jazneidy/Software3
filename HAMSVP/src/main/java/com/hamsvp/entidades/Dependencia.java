package com.hamsvp.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dependencia database table.
 * 
 */
@Entity
@NamedQuery(name="Dependencia.findAll", query="SELECT d FROM Dependencia d")
public class Dependencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Dependencia id;

	private String descripcion;

	private String nombre;

	//bi-directional many-to-one association to Invetario
	@ManyToOne
	private Invetario invetario;

	public Dependencia() {
	}

	public Dependencia getId() {
		return this.id;
	}

	public void setId(Dependencia id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Invetario getInvetario() {
		return this.invetario;
	}

	public void setInvetario(Invetario invetario) {
		this.invetario = invetario;
	}

}