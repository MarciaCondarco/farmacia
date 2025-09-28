package farmacia;

import java.util.Scanner;

import farmacia.util.CoresFarmacia;

public class Produto {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while(true) {
			
			System.out.println(CoresFarmacia.TEXT_GREEN  + 
					"***********************************");
			System.out.println("			      	   ");
			System.out.println(CoresFarmacia.TEXT_GREEN + "     Farmacia DEVAS	 	   ");
			System.out.println("			      	   ");
			System.out.println(CoresFarmacia.TEXT_GREEN + "	1 - Adicionar produto             ");
			System.out.println(CoresFarmacia.TEXT_GREEN + "	2 - Listar produto 	           ");
			System.out.println(CoresFarmacia.TEXT_GREEN + "	3 - Apagar produto                ");
			System.out.println(CoresFarmacia.TEXT_GREEN + "	4 - Sair                          ");
			System.out.println("			      	   ");
			System.out.println(CoresFarmacia.TEXT_GREEN + "***********************************");
			
			System.out.println("Qual opção deseja? ");
			opcao = leia.nextInt();
			
			
			
			switch(opcao) {
			case 1:
				System.out.println("adicionando produto");
				break;
			case 2:
				System.out.println("Listando o produto");
				break;
			case 3:
				System.out.println("Apagando o produto");
				break;
			case 4:
				System.out.println("Saindo ...");
				break;
			}
		}

	}

}
