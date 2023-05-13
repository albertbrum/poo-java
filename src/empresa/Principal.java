package empresa;

import java.util.Scanner;

public class Principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		
		Cofrinho cofrinho = new Cofrinho();
		
		System.out.println("Menu");
		System.out.println("1-Adicionar Moeda");
		System.out.println("2-Remover Moeda");
		System.out.println("3-Listar Moedas");
		System.out.println("4-Calcular total convertido para Real");
		System.out.println("0-Encerrar");
		opcao=teclado.nextInt();
		
		int tipoMoed;
		double valor;
		Moeda moed;
		
		while(opcao!=0) {
			
			switch(opcao) {
			
			case 1:
				tipoMoed=0;
				while(tipoMoed>3 || tipoMoed<=0) {
					System.out.println("1-Real");
					System.out.println("2-Dolar");
					System.out.println("3-Euro");
					tipoMoed = teclado.nextInt();
				}
								
				moed =null;
				if(tipoMoed==1) {
					System.out.println("Digite Valor:");
					valor = teclado.nextDouble();
					moed = new Real(valor);
				}
				else if(tipoMoed==2) {
					System.out.println("Digite Valor:");
					valor = teclado.nextDouble();
					moed = new Dolar(valor);
				}
				else if(tipoMoed==3) {
					System.out.println("Digite Valor:");
					valor = teclado.nextDouble();
					moed = new Euro(valor);
				}
				
				cofrinho.adicionar(moed);
								
				break;
			case 2:
				tipoMoed=0;
				while(tipoMoed>3 || tipoMoed<=0) {
					System.out.println("1-Real");
					System.out.println("2-Dolar");
					System.out.println("3-Euro");
					tipoMoed = teclado.nextInt();
				}
								
				moed =null;
				if(tipoMoed==1) {
					System.out.println("Digite Valor:");
					valor = teclado.nextDouble();
					moed = new Real(valor);
				}
				else if(tipoMoed==2) {
					System.out.println("Digite Valor:");
					valor = teclado.nextDouble();
					moed = new Dolar(valor);
				}
				else if(tipoMoed==3) {
					System.out.println("Digite Valor:");
					valor = teclado.nextDouble();
					moed = new Euro(valor);
				}
				
				cofrinho.remover(moed);
				break;
				
			case 3:
				cofrinho.listar();
				break;
				
			case 4:
				cofrinho.listarTotalConvertido();
				break;
				
			default:
				System.out.println("Opcao invalida!");				
			}
			
			System.out.println("Menu");
			System.out.println("1-Adicionar Moeda");
			System.out.println("2-Remover Moeda");
			System.out.println("3-Listar Moedas");
			System.out.println("4-Calcular total convertido para Real");
			System.out.println("0-Encerrar");
			opcao=teclado.nextInt();				
			
		}
		
		
		
		

		
	}
}
