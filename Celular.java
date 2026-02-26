package br.com.ridefiap.model;

public class Celular {
	private String marca;
	private String cor;
	private int capacidadeemGb;

	public Celular(String marca, String cor, int capacidadeemGb) {
		this.marca = marca;
		this.cor = cor;
		this.capacidadeemGb = capacidadeemGb;
	}

	public String getMarca() {
		return marca;
	}

	public String getCor() {
		return cor;
	}

	public int getCapacidadeemGb() {
		return capacidadeemGb;
	}

	public boolean alterarCor(String novaCor) {
		if (novaCor != null && !novaCor.trim().isEmpty()) {
			this.cor = novaCor;
			System.out.println("Cor do celular alterada para: " + novaCor);
			return true;
		} else {
			System.out.println("Erro: A nova cor não pode ser vazia.");
			return false;
		}
	}

	public boolean aumentarCapacidade(int capacidadeAdicional) {
		if (capacidadeAdicional > 0) {
			int novaCapacidade = this.capacidadeemGb + capacidadeAdicional;
			if (novaCapacidade <= 1024) { // Regra de negócio: capacidade máxima de 1024GB
				this.capacidadeemGb = novaCapacidade;
				System.out.println("Capacidade do celular aumentada em " + capacidadeAdicional + "GB. Nova capacidade: " + this.capacidadeemGb + "GB.");
				return true;
			} else {
				System.out.println("Erro: A capacidade excede o limite máximo de 1024GB.");
				return false;
			}
		} else {
			System.out.println("Erro: A capacidade adicional deve ser um valor positivo.");
			return false;
		}
	}
}
