package com.hamsvp.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the `caja menor` database table.
 * 
 */
@Entity
@Table(name="`caja menor`")
@NamedQuery(name="Caja_menor.findAll", query="SELECT c FROM Caja_menor c")
public class Caja_Menor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="`idcaja menor`")
	private int idcaja_menor;

	private String concepto;

	private int egreso;

	private int ingreso;

	private int saldo;

	

	public int getIdcaja_menor() {
		return this.idcaja_menor;
	}

	public void setIdcaja_menor(int idcaja_menor) {
		this.idcaja_menor = idcaja_menor;
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