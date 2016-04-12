package com.hamsvp.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the `asientos de ajustes a ingresos` database table.
 * 
 */
@Entity
@Table(name="`asientos de ajustes a ingresos`")
@NamedQuery(name="Asientos_de_ajustes_a_ingreso.findAll", query="SELECT a FROM Asientos_de_ajustes_a_ingreso a")

public class Asientos_de_ajustes_a_ingreso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="`idasientos de ajustes a ingresos`")
	private int idasientos_de_ajustes_a_ingresos;

	@Column(name="`asientos de ajustes a ingresoscol`")
	private String asientos_de_ajustes_a_ingresoscol;

	private String maquinariaYEquipo;

	private String superAvitDonacion;

	private String transferanciaBancaria;

	public Asientos_de_ajustes_a_ingreso() {
	}

	public int getIdasientos_de_ajustes_a_ingresos() {
		return this.idasientos_de_ajustes_a_ingresos;
	}

	public void setIdasientos_de_ajustes_a_ingresos(int idasientos_de_ajustes_a_ingresos) {
		this.idasientos_de_ajustes_a_ingresos = idasientos_de_ajustes_a_ingresos;
	}

	public String getAsientos_de_ajustes_a_ingresoscol() {
		return this.asientos_de_ajustes_a_ingresoscol;
	}

	public void setAsientos_de_ajustes_a_ingresoscol(String asientos_de_ajustes_a_ingresoscol) {
		this.asientos_de_ajustes_a_ingresoscol = asientos_de_ajustes_a_ingresoscol;
	}

	public String getMaquinariaYEquipo() {
		return this.maquinariaYEquipo;
	}

	public void setMaquinariaYEquipo(String maquinariaYEquipo) {
		this.maquinariaYEquipo = maquinariaYEquipo;
	}

	public String getSuperAvitDonacion() {
		return this.superAvitDonacion;
	}

	public void setSuperAvitDonacion(String superAvitDonacion) {
		this.superAvitDonacion = superAvitDonacion;
	}

	public String getTransferanciaBancaria() {
		return this.transferanciaBancaria;
	}

	public void setTransferanciaBancaria(String transferanciaBancaria) {
		this.transferanciaBancaria = transferanciaBancaria;
	}

}