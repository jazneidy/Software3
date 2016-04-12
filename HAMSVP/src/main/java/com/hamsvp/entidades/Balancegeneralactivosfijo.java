package com.hamsvp.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the balancegeneralactivosfijos database table.
 * 
 */
@Entity
@Table(name="balancegeneralactivosfijos")
@NamedQuery(name="Balancegeneralactivosfijo.findAll", query="SELECT b FROM Balancegeneralactivosfijo b")
public class Balancegeneralactivosfijo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idBalanceGeneralActivosFijos;

	private String cantidad;

	private String elemento;

	private String valor;

	private String valorTotal;

	public Balancegeneralactivosfijo() {
	}

	public int getIdBalanceGeneralActivosFijos() {
		return this.idBalanceGeneralActivosFijos;
	}

	public void setIdBalanceGeneralActivosFijos(int idBalanceGeneralActivosFijos) {
		this.idBalanceGeneralActivosFijos = idBalanceGeneralActivosFijos;
	}

	public String getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getElemento() {
		return this.elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getValorTotal() {
		return this.valorTotal;
	}

	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}

}