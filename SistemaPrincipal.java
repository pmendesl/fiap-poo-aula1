package br.com.ridefiap.main;

import br.com.ridefiap.model.Celular;

public class SistemaPrincipal {
	public static void main(String[] args) {
		// Instanciando Celular com o novo construtor
		Celular meuCelular = new Celular("Iphone", "Cinza", 256);
		Celular celulardoamigo = new Celular("Samsung", "Roxo", 128);

		System.out.println("--- Estado Inicial dos Celulares ---");
		System.out.println("Meu celular: " + meuCelular.getMarca() + ", Cor: " + meuCelular.getCor() + ", Capacidade: " + meuCelular.getCapacidadeemGb() + "GB");
		System.out.println("Celular do amigo: " + celulardoamigo.getMarca() + ", Cor: " + celulardoamigo.getCor() + ", Capacidade: " + celulardoamigo.getCapacidadeemGb() + "GB\n");

		System.out.println("--- Testando método alterarCor() ---");
		// Teste válido
		meuCelular.alterarCor("Preto");
		System.out.println("Meu celular (após alteração válida): " + meuCelular.getCor());

		// Teste inválido (cor vazia)
		celulardoamigo.alterarCor("");
		System.out.println("Celular do amigo (após alteração inválida): " + celulardoamigo.getCor() + "\n");

		System.out.println("--- Testando método aumentarCapacidade() ---");
		// Teste válido
		meuCelular.aumentarCapacidade(128);
		System.out.println("Meu celular (após aumento válido): " + meuCelular.getCapacidadeemGb() + "GB");

		// Teste inválido (capacidade adicional negativa)
		celulardoamigo.aumentarCapacidade(-64);
		System.out.println("Celular do amigo (após aumento inválido): " + celulardoamigo.getCapacidadeemGb() + "GB");

		// Teste inválido (excedendo capacidade máxima)
		meuCelular.aumentarCapacidade(1000);
		System.out.println("Meu celular (após aumento que excede o limite): " + meuCelular.getCapacidadeemGb() + "GB\n");

		System.out.println("--- Estado Final dos Celulares ---");
		System.out.println("Meu celular: " + meuCelular.getMarca() + ", Cor: " + meuCelular.getCor() + ", Capacidade: " + meuCelular.getCapacidadeemGb() + "GB");
		System.out.println("Celular do amigo: " + celulardoamigo.getMarca() + ", Cor: " + celulardoamigo.getCor() + ", Capacidade: " + celulardoamigo.getCapacidadeemGb() + "GB");
	}
}
