package com.classes;

public class Administrador extends UsuarioComum{
	private String nomeAdm;
	private String email;
	
	
	//construtores
	public Administrador() {
		
	}
	
	public Administrador(String nomeAdm, String email) {
		super();
		this.nomeAdm = nomeAdm;
		this.email = email;
	}



	//Get and Set
	public String getNomeAdm() {
		return nomeAdm;
	}
	public void setNomeAdm(String nomeAdm) {
		if (nomeAdm.length() > 0)
			this.nomeAdm = nomeAdm;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (email.length() > 0)
			this.email = email;
	}
	//toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Administrador [nomeAdm=");
		builder.append(nomeAdm);
		builder.append(", email=");
		builder.append(email);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
