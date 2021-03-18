package com.classes;

public class Cliente extends UsuarioComum {
	private String nomeUsuario;
	private String email;
	private String cartaoCredito;
	private float limiteCredito;
	
	//construtores
	public Cliente() {
		
	}
	
	public Cliente(String nomeUsuario, String email, String cartaoCredito, float limiteCredito,long userId,long senha, boolean online) {
		super();
		this.nomeUsuario = nomeUsuario;
		this.email = email;
		this.cartaoCredito = cartaoCredito;
		this.limiteCredito = limiteCredito;
	}

	//Get and Set
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		if (nomeUsuario.length() > 0)
			this.nomeUsuario = nomeUsuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (email.length() > 0)
			this.email = email;
	}
	public String getCartaoCredito() {
		return cartaoCredito;
	}
	public void setCartaoCredito(String cartaoCredito) {
		if (cartaoCredito.length() > 0)
			this.cartaoCredito = cartaoCredito;
	}
	public float getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(float limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	//toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [nomeUsuario=");
		builder.append(nomeUsuario);
		builder.append(", email=");
		builder.append(email);
		builder.append(", cartaoCredito=");
		builder.append(cartaoCredito);
		builder.append(", limiteCredito=");
		builder.append(limiteCredito);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
