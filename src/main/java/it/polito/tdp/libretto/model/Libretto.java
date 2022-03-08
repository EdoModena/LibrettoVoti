package it.polito.tdp.libretto.model;
import java.util.*;

public class Libretto {
	private List<Voto> voti;
	
	public Libretto() {
		this.voti=new ArrayList<Voto>();
	}
	
	public void add(Voto v) {
		this.voti.add(v);
	}

	@Override
	public String toString() {
		return this.voti.toString();
	}
	
	public Libretto filtraPunti(int punti) {
		Libretto result=new Libretto();
		for(Voto v: voti) {
			if(v.getPunti()==punti)
				result.add(v);
		}
		return result;
	}
	
	public Integer puntiEsame(String nome) {
		for(Voto v: voti) {
			if(v.getNome().compareTo(nome)==0)
				return v.getPunti();
		}
		//return -1;
		//throw new IllegalArgumentException("Corso non trovato");
		return null;
	}
	
	public boolean isDuplicato(Voto v) {
		for(Voto v1:voti) {
			if(v1.equals(v)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isConflitto(Voto v) {
		Integer punti=this.puntiEsame(v.getNome());
		if(punti!=null && punti!=v.getPunti())
			return true;
		else
			return false;
	}
}
