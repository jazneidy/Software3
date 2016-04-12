package com.hamsvp.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the davivienda database table.
 * 
 */
@Entity
@NamedQuery(name="Davivienda.findAll", query="SELECT d FROM Davivienda d")
public class Davivienda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int iddavivienda;

	private String concepto;

	private int egreso;

	private int ingreso;

	private int saldo;

	public Davivienda() {
	}

	public int getIddavivienda() {
		return this.iddavivienda;
	}

	public void setIddavivienda(int iddavivienda) {
		this.iddavivienda = iddavivienda;
	}

	public String getConcepto() {
		return this.concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public int getEgreso() {
		return this.egreso;
	}

	public void setEgreso(int egreso) {
		this.egreso = egreso;
	}

	public int getIngreso() {
		return this.ingreso;
	}

	public void setIngreso(int ingreso) {
		this.ingreso = ingreso;
	}

	public int getSaldo() {
		return this.saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

}