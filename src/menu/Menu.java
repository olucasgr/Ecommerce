package menu;

import java.util.Scanner;
import produto.model.Eletronico;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Eletronico eletronico1 = new Eletronico(01,"Notebook", "Notebook de alto desempenho", 3000.0, 10,"Dell","Inspiron");
		eletronico1.visualizar();
		
		
		Scanner sc = new Scanner (System.in);
		
		// Criando as variáveis
		int opcao;
		boolean saida = false;
		
		// Laço de repetição do menu
		
		 do {
			 System.out.println("------------------------------------------");
			 System.out.println("------------ Ecommercialize ------------- ");
			 System.out.println("     1 - Criar Produto				   	   ");
			 System.out.println("     2 - Listar Produto				   ");
			 System.out.println("     3 - Atualizar Produto				   ");
			 System.out.println("     4 - Excluir Produto				   ");
			 System.out.println("     0 - Sair				   			   ");
			 System.out.println("------------------------------------------");
			 System.out.println("Escolha uma opção:");
			 opcao = sc.nextInt();
			 
		// Decidindo de acordo com a entrada do usuário 
			 
			 switch (opcao) {
				case 1:
					System.out.println("Criando produto ...");
					break;
					
				case 2:
					System.out.println("Listando produtos ...");
					break;
					
				case 3:
					System.out.println("Atualizando produto ...");
					break;
					
				case 4:
					System.out.println("Excluindo produto ...");
					break;
					
				case 0:
					System.out.println("Saindo ...");
					return;

				default:
					System.out.println("Opção inválida !");
					break;
				}
			 
		 }while(!saida);
		 
 
		
		sc.close();
		
	}
	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Lucas Rodrigues - lucasrctt@gmail.com");
		System.out.println("github.com/olucasgr");
		System.out.println("*********************************************************");
	}

}
