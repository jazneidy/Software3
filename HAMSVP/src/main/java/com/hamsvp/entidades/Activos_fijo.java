package com.hamsvp.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the `activos fijos` database table.
 * 
 */
@Entity
@Table(name="`activos fijos`")
@NamedQuery(name="Activos_fijo.findAll", query="SELECT a FROM Activos_fijo a")
public class Activos_fijo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="`idactivos fijos`")
	private int idactivos_fijos;

	private String comunicacion;

	private String enseres;

	private String maquinaria;

	public Activos_fijo() {
	}

	public int getIdactivos_fijos() {
		return this.idactivos_fijos;
	}

	public void setIdactivos_fijos(int idactivos_fijos) {
		this.idactivos_fijos = idactivos_fijos;
	}

	public String getComunicacion() {
		return this.comunicacion;
	}

	public void setComunicacion(String comunicacion) {
		this.comunicacion = comunicacion;
	}

	public String getEnseres() {
		return this.enseres;
	}

	public void setEnseres(String enseres) {
		this.enseres = enseres;
	}

	public String getMaquinaria() {
		return this.maquinaria;
	}

	public void setMaquinaria(String maquinaria) {
		this.maquinaria = maquinaria;
	}

}