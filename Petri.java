package RedeDePetri;

import java.util.Scanner;

public class Petri {

	private Local[] aLocais;
	private Transicao[] aTransicoes;

	public Petri(int quantLocais, int quantTransicoes) {
		geraRedeDePetri(quantLocais, quantTransicoes);
	}

	private void geraRedeDePetri(int quantLocais, int quantTransicoes) {
		InstanciaLocaisComTokens(quantLocais, quantTransicoes);
		
	}

	private void InstanciaLocaisComTokens(int quantLocais, int quantTransicoes) {
		this.aTransicoes = new Transicao[quantTransicoes];
		this.aLocais = new Local[quantLocais];
		
		
			for (int i = 0; i < aLocais.length; i++) {
				Scanner s =new Scanner(System.in);
				System.out.println("Quantos tokens L"+i+" terá: ");
				int tokens = s.nextInt();
					aLocais[i]=new Local(tokens);
					s.close();
					
				/**
				 
			 	 *Aqui cada Local tem um arco de saida e uma quant de tokens

			 	 *			Arco arcoSaida = new Arco (aLocais[i]);
								aLocais[i].setSaidaEspecifica(arcoSaida, 0);
			 	*/
			}
			
			InstanciaSaidasParaLocais();
			InstanciaTransicoesBaseadosNosLocaisJaExistentes();
			
	}
	
	private void InstanciaSaidasParaLocais() {
		Scanner s = new Scanner(System.in);
		
		
		for (int i = 0; i < aLocais.length; i++) {
			System.out.println("Quantas saidas L"+i+" terá: ");
			int quantSaidas = s.nextInt();								//CRIAR METODO PARA TRATAR INTEIROS SIMPLES
			if (quantSaidas < 0) quantSaidas=0;
			else {
				for (int j = 0; j < quantSaidas; j++) {
					Arco Saida = new Arco(aLocais[i]);
					aLocais[i].setSaidaEspecifica(Saida, j);
				}
			}
			
		}
		
		s.close();
	}
	
	private void InstanciaTransicoesBaseadosNosLocaisJaExistentes() {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < aTransicoes.length; i++) {
			System.out.println("Quantas entradas T"+i+" terá: ");
			int quantEntradas = s.nextInt();								//CRIAR METODO PARA TRATAR INTEIROS MULTIPLOS
			if (quantEntradas <= 0) quantEntradas=1;
			for (int j = 0; j<quantEntradas ; j++) {
				System.out.println("Qual a "+j+" entrada de T"+i+": ");
				int LocalEntrada=s.nextInt();
				aTransicoes[i]=new Transicao(aLocais[LocalEntrada].getSaidas());
				InstanciaTransicaoNoArcoDeSaidaDosLocais(i);
			}	//aLocais[i].getSaidaEspecifica(i).setTransicao(aTransicoes[i])
		}
		s.close();
	}

	private String InstanciaTransicaoNoArcoDeSaidaDosLocais(int i) {
		for (int j = 0; j < aLocais.length; j++) {
			for (int j2 = 0; j2 < aLocais.length; j2++) {
				if(aLocais[j].getSaidaEspecifica(j2).setTransicao(aTransicoes[i]))
					return ("Arco " + j2 + " de L" + j + "recebeu a T" + i );
				else
					return ("Arco " + j2 + "de L" + j + "nao pode receber T" + i);
			}
		}
		return ("Erro em instanciar transicao no arco de saide dos locais!");
	}
	
	
	
	
	
	
	
	
	

}