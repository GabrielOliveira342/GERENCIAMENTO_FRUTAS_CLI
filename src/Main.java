import java.util.ArrayList; //para armazenar lista
import java.util.InputMismatchException; //para identificar erro de entrada de dados
import java.util.Scanner; //ler os dados postos pelo usuario 

public class Main { //class main 

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in); //instanciando o scanner 
		ArrayList<String> frutas = new ArrayList<>(); //array para armazenar as frutas
		
		while (true) { //entra em um loop que so para quando o usuario sair 
			try {
				System.out.println("\nEscolha uma opção: "); //imprimindo as escolhas para o usuario 
				System.out.println("1. Adicionar uma fruta"); //adicionar 
				System.out.println("2. Listar todas as frutas"); //listar 
				System.out.println("3. Modificar uma fruta"); //modificar ou uptade 
				System.out.println("4. Remover uma fruta"); //remover ou delete 
				System.out.println("5. Sair"); //sair 
				System.out.print("Opção: ");
			
				int opcao = scanner.nextInt(); //ler a opção em formato de numero do usuario 
				scanner.nextLine();
			
			switch (opcao) { //switch para decidir a ação do usuario 
			case 1: 
				System.out.println("Digite o nome da fruta para adicionar: "); //exibir a ação para o usuario 
				String novaFruta = scanner.nextLine(); //instanciando a nova fruta 
				frutas.add(novaFruta); 
				System.out.println(novaFruta + " foi adicionada."); //retornando que foi adicionada 
				break; //finaliza o case
			case 2:
				System.out.println("Frutas: "+frutas); //exibe o array list 
				break; //finaliza o case 
			case 3:
				System.out.print("Digite o indice da fruta que deseja modificar: "); //indica a ação para o usuario 
				int indiceModificar = scanner.nextInt(); //instanciando o fruta modificada 
				scanner.nextLine();
				if(indiceModificar >= 0 && indiceModificar < frutas.size()) { //if para modificar a fruta 
					System.out.print("Digite o novo nome da fruta: "); //indicando para mudar a fruta 
					String frutaModificada = scanner.nextLine(); //instanciando a fruta modifiada 
					frutas.set(indiceModificar, frutaModificada); 
					System.out.println("Fruta no índice "+indiceModificar + " foi modificada para "+ frutaModificada); //retoro para o usuario
					
			} else { //else para valor invalido 
				System.out.println("Índice invalido. "); //retorno para o usuario
			}
			break; //finaliza o case 
			case 4:
				System.out.println("Digite o nome da fruta que deseja remover: "); //indica a ação para o usuario
				String frutaRemover = scanner.nextLine(); //instancia a fruta removida
				if(frutas.remove(frutaRemover)) { //if para remover a fruta 
					System.out.println(frutaRemover+" foi removida. "); //retornando que foi removida 
				} else { //else caso de errado 
					System.out.println(frutaRemover+"não foi encontrada. "); //exibindo que não foi encontrado
				}
			break;//finaliza o case 
			case 5:
				System.out.println("Saindo...."); //exibindo a saida para o usuario
				scanner.close(); //fechando o switch 
				return;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida. Por favor, digite um numero. ");
			scanner.nextLine();
		}

	}

}
}

