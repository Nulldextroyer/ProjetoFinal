package com.classes;

public class UsuarioComum {
	private int userId;
	private int senha;
	private boolean online;
	
	public UsuarioComum() {
		
	}
	
	public UsuarioComum(int userId, int senha, boolean online) {
		this.userId = userId;
		this.senha = senha;
		this.online = online;
	}

	//Get and Set
	public long getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		if (userId > 0)
			this.userId = userId;
	}
	public long getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		if (senha > 0)
			this.senha = senha;
	}
	public boolean isOnline() {
		return online;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}
	
	//toString 
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UsuarioComum [userId=");
		builder.append(userId);
		builder.append(", senha=");
		builder.append(senha);
		builder.append(", online=");
		builder.append(online);
		builder.append("]");
		return builder.toString();
	}
	
}
