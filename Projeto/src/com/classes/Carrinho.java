package com.classes;


public class Carrinho {
	private float valor;
	private int idCarrinho;
	
	//construtores
	public Carrinho() {
		
	}
	
	public Carrinho(float valor, int idCarrinho) {
		this.valor = valor;
		this.idCarrinho = idCarrinho;
	}



	//Get and Set	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		if(valor >= 0)
			this.valor = valor;
	}
	public long getIdCarrinho() {
		return idCarrinho;
	}
	public void setIdCarrinho(int idCarrinho) {
		if (idCarrinho > 0)
			this.idCarrinho = idCarrinho;
	}
	
	public boolean aprovarCompra(Cliente cliente) {
		if((cliente.getLimiteCredito() - getValor()) >= 0) {
			return true;
		}else {
			return false;
		}
	}
	
	//toString 	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carrinho [valor=");
		builder.append(valor);
		builder.append(", idCarrinho=");
		builder.append(idCarrinho);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}	
	
}
