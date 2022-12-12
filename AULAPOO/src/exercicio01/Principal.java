package exercicio01;
import java.util.Scanner; 

public class Principal {

	public static void main(String[] args) {
		// declaração de variáveis
		
		String nome;
		int idade, anosContribuicao;
		float alvo, juros, contribuicao, saldo;
		
		//declaração do scanner. Nome do scanner=input.	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		nome = input.next();
		System.out.println("Digite a sua idade:");
		idade = input.nextInt();
		System.out.println("Digite o seu alvo em dinheiro para a aposentadoria:");
		alvo = input.nextFloat();
		System.out.println("Digite o valor anual da sua contribuição:");
		contribuicao = input.nextFloat();		
		System.out.println("Digite o total de anos de contribuição:");
		anosContribuicao = input.nextInt();
		System.out.println("Digite o seu saldo acumulado:");
		saldo = input.nextFloat();
		
		
		juros = 10 / 100;
		
		while (saldo < alvo) {
			saldo = (float) ((saldo + contribuicao) * (1 + juros));
			anosContribuicao++;
		}
		
		String infoAnos = "Você terá que trabalhar:";
		
		System.out.println(infoAnos + anosContribuicao + " anos");
		
		
		

	}

}
