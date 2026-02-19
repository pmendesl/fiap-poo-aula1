package br.com.ridefiap.main;

import br.com.ridefiap.model.Celular;

public class SistemaPrincipal {
	public static void main(String[] args) {
	Celular meuCelular = new Celular();
	meuCelular.marca = "Iphone";
	meuCelular.cor = "Cinza";
	meuCelular.capacidadeemGb = 256;
	
	Celular celulardoamigo = new Celular();
	celulardoamigo.marca = "Iphone";
	celulardoamigo.cor = "Roxo";
	celulardoamigo.capacidadeemGb = 256;
	System.out.println("Meu celular é: " + meuCelular.marca);
	System.out.println("Celular do meu amigo é: " + celulardoamigo.marca);
	}

}
