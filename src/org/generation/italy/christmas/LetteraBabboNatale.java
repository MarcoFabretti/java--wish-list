package org.generation.italy.christmas;

import java.util.*;

public class LetteraBabboNatale {
	String nome;
	String indirizzo;
	ArrayList<String> listaDesideri;

	LetteraBabboNatale(String nome, String indirizzo, ArrayList<String> listaDesideri) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.listaDesideri = listaDesideri;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public ArrayList<String> getListaDesideri() {
		return listaDesideri;
	}

	public void setListaDesideri(ArrayList<String> listaDesideri) {
		this.listaDesideri = listaDesideri;
	}

	public String invia() throws Exception {
		String report = "Operazione fallita";
		if (listaDesideri.size() > 5) {
			throw new Exception("Lista desideri troppo lunga");
		} else
			report = nome.concat(" idnirizzo: " + indirizzo + " La tua lista contine: " + listaDesideri.size());
		return report;
	}
}
