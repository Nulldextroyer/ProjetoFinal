package com.classes;

public class Produtos {
	private String nomeProduto;
	private int id;
	private double preco;
	
	
	public Produtos() {
		
	}
	
	public Produtos(String nomeProduto, int id, double preco) {
		this.nomeProduto = nomeProduto;
		this.id = id;
		this.preco = preco;
	}

	
	//
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	
	//toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produtos [nomeProduto=");
		builder.append(nomeProduto);
		builder.append(", id=");
		builder.append(id);
		builder.append(", preco=");
		builder.append(preco);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
