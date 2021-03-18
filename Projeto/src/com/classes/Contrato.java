package com.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	private int numeroContrato;
	private Date data;
	private double valorTotal;
	
	List<Parcelas> parcelas = new ArrayList<Parcelas>();
	
	//construtores
	public Contrato() {
		
	}

	public Contrato(int numeroContrato,Date data, double valorTotal) {
		super();
		this.numeroContrato = numeroContrato;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	
	//Get and Set
	public int getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public List<Parcelas> getParcelas() {
		return parcelas;
	}
	
	// metodos 
	
	public long ConvertDate() {
		return data.getTime();
	}
	//toString

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contrato [numeroContrato=");
		builder.append(numeroContrato);
		builder.append(", data=");
		builder.append(data);
		builder.append(", valorTotal=");
		builder.append(valorTotal);
		builder.append("]");
		return builder.toString();
	}
	
}
