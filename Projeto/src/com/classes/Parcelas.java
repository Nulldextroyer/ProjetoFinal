package com.classes;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelas {
	private Date vencimento;
	private double valorParcela;
	
	private static SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
	
	//Contrutores
	public Parcelas() {
		
	}

	public Parcelas(Date vencimento, double valorParcela) {
		super();
		this.vencimento = vencimento;
		this.valorParcela = valorParcela;
	}

	//Get an Set
	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(double valorParcela) {
		this.valorParcela = valorParcela;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Parcelas [vencimento=");
		builder.append(fd.format(vencimento));
		builder.append(", valorParcela=");
		builder.append(valorParcela);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
