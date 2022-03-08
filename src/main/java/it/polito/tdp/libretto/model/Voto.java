package it.polito.tdp.libretto.model;

import java.util.Objects;

public class Voto {
	public Voto(String nome, int punti) {
		super();
		this.nome = nome;
		this.punti = punti;
	}
	private String nome;
	private int punti;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPunti() {
		return punti;
	}
	public void setPunti(int punti) {
		this.punti = punti;
	}
	@Override
	public String toString() {
		return "nome:" + nome + ", voto:" + punti;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome, punti);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voto other = (Voto) obj;
		return Objects.equals(nome, other.nome) && punti == other.punti;
	}
	
	
	
	
}
