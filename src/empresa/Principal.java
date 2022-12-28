package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Cofrinho cofre = new Cofrinho();
		boolean sair = false;
		Moeda m=null;
		System.out.println("Bem vindo ao controle de moedas John Ur-3882572:");
		
		while(sair==false) {
			try {
			System.out.println("Escolha a opcao desejada:\n1-Add moeda\n2-Remover moeda\n3-Consultar lista de Moeda\n4-Consultar total em Reais R$\n5-Sair");
			Scanner teclado=new Scanner(System.in);
			int opcao=teclado.nextInt();
			
				//adicionar valor 
				if(opcao==1) {
					System.out.println("Selecione tipo de moeda:\n1-Real\n2-Dolar\n3-Euro");
					int tipo=teclado.nextInt();
					if(tipo==1){
						System.out.println("Digite o valor: ");
						double valorM= teclado.nextDouble();
						 m=new Real(valorM);							
					}
					else if(tipo==2){
						System.out.println("Digite o valor: ");
						 m=new Dolar(teclado.nextDouble());
					}
					else if(tipo==3){
						System.out.println("Digite o valor: ");
						 m=new Euro(teclado.nextDouble());
					}
					else {
						System.out.println("Numero incorreto tente novamente");	
					}
					cofre.add(m);
					System.out.println("Valor: "+m.valor+" adicionado! ");
					System.out.println("-------------------------------");
					continue;
				}
				//remover valor 
				else if(opcao==2) {
					System.out.println("Selecione tipo de moeda para excluir:\n1-Real\n2-Dolar\n3-Euro");
					int tipo=teclado.nextInt();
					if(tipo==1){
						System.out.println("Digite o valor: ");
						double valorM= teclado.nextDouble();
						m=new Real(valorM);	
					}
					else if(tipo==2){
						System.out.println("Digite o valor: ");
						m=new Dolar(teclado.nextDouble());
					}
					else if(tipo==3){
						System.out.println("Digite o valor: ");
						m=new Euro(teclado.nextDouble());
					}
					else {
						System.out.println("Numero incorreto tente novamente");
					}
					cofre.remover(m);
					System.out.println("-------------------------------");
					continue;
				}
				//opcao lista com todas as entradas validas 
				else if(opcao==3) {
					cofre.listagemMoeda();
					System.out.println("-------------------------------");
				}
				//opcao total convertido em reais
				else if(opcao==4){
					System.out.println("Valores para conversao:");
					Real.info();
					Dolar.info();
					Euro.info();
					cofre.totalConverido();
					System.out.println("-------------------------------");
									
				}
				//Opcao finalizar
				else if(opcao==5) {
					System.out.println("Obrigado!");
					System.out.println("Fechando Programa! ");
					sair=true;
					
				}
				else {
					System.out.println("Algo foi digitado errado, tente novamente");
				}
		
		}
		//Tratamento de erro	
		catch(Exception e){
			System.out.println("Algo foi digitado incorretamente, tente novamente");
			System.out.println("Verifique por Numeros como opcoes ou digite o valor para deposito com Virgula");
			System.out.println("_____________________");
			
		}
		
			
	}
		
	}
}
			
		
