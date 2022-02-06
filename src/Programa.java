//7 – Escreva um programa Java que tem como objetivo ser um quis de Pergunta e respostas.
//Na tela, você perguntará ao usuário e ele responderá. Se o usuário acertar ou errar, você
//precisa informar se ele acertou ou errou e passar para próxima pergunta (enquanto houver
//próxima). Utilizem array para guardar as Pergunta e respostas.
//No fim do quis, você deve apresentar quantas o usuário acertou e quantas ele errou, como
//no exemplo abaixo(não precisa ser exatamente assim):
//Ex:
//
//Usuario XPTO
//Acertos: 6
//Erros: 4

import java.util.Scanner;

public class Programa {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite o nome do Usuario: ");
		String usuario = sc.next();
		int acerto = 0,
		erro = 0;
		
		Pergunta[] perguntas = { 
				new Pergunta ("De onde e o personagem Monkey D. Luffy?",
						new Resposta ("One piece", true),
						new Resposta ("Dragon Ball Z", false),
						new Resposta ("Fairy Tail", false)),
				new Pergunta ("Da onde e o personagem Goku?",
						new Resposta ("One piece", false),
						new Resposta ("Dragon Ball Z", true),
						new Resposta ("Fairy Tail", false)),
				new Pergunta ("Da onde e o personagem Natsu Dragneel?",
						new Resposta ("One piece", false),
						new Resposta ("Dragon Ball Z", false),
						new Resposta ("Fairy Tail", true))
		}; 
		
		for (Pergunta pergunta : perguntas) {
			System.out.println("\n" + pergunta);
			char letra = 'a';
			for(Resposta resposta : pergunta.getRespostas()) {
				System.out.println( letra++ + ") " + resposta);
			}
			Resposta resposta = pergunta.getRespostas()[getIndex(perguntas)];
			if(resposta.isCorreto()) {
				System.out.println("\nAcertou!");
				acerto++;
			} else {
				System.out.println("\nErrou!");
				erro++;
			}
		}
		
		if (acerto > erro) {
			System.out.println("\nVOCE GANHOU!");
		}else {
			System.out.println("\nVOCE PERDEU!");
		}
		
		System.out.println("Usuario: " + usuario);
		System.out.println("Acerto: " + acerto);
		System.out.println("Erro: " + erro);
		
		sc.close();
	}
	
	public static int getIndex (Pergunta[] perguntas) {
		int index = sc.next().charAt(0) - 97;
		if (index < 0 || index >= perguntas.length){
			System.out.println("Favor digitar uma opcao valida.");
			return getIndex(perguntas);	
		}
		return index;
	}

}
