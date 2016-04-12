package com.hamsvp.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the `acividades hogar` database table.
 * 
 */
@Entity
@Table(name="`acividades hogar`")
@NamedQuery(name="Acividades_hogar.findAll", query="SELECT a FROM Acividades_hogar a")
public class Acividades_hogar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="`idacividades hogar`")
	private int idacividades_hogar;

	private String concepto;

	private int egresos;

	private int ingresos;

	private int saldo;

	public Acividades_hogar() {
	}

	public int getIdacividades_hogar() {
		return this.idacividades_hogar;
	}

	public void setIdacividades_hogar(int idacividades_hogar) {
		this.idacividades_hogar = idacividades_hogar;
	}

	public String getConcepto() {
		return this.concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public int getEgresos() {
		return this.egresos;
	}

	public void setEgresos(int egresos) {
		this.egresos = egresos;
	}

	public int getIngresos() {
		return this.ingresos;
	}

	public void setIngresos(int ingresos) {
		this.ingresos = ingresos;
	}

	public int getSaldo() {
		return this.saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

}