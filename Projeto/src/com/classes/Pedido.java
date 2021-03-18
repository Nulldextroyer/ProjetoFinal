package com.classes;

import java.util.Date;

import com.enumeracao.StatusPedido;

public class Pedido {
	private int id;
	private Date momento;
	private StatusPedido status;
	
	//contrutores
	public Pedido() {
		
	}

	public Pedido(int id, Date momento, StatusPedido status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	
	//Get and Set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [id=");
		builder.append(id);
		builder.append(", momento=");
		builder.append(momento);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
	
	//toString
	
}
