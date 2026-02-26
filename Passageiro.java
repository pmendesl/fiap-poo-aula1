package br.com.ridefiap.model;

public class Passageiro {
	private String nome;
	private double saldo;

	public Passageiro(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public double getSaldo() {
		return saldo;
	}
}
