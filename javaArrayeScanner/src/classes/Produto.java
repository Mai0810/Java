package classes;

import java.util.Scanner;

public class Produto {
	private int idProduto;
	private String nome;
	
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public Produto incluirProduto() {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Qual é o ID do produto:");
		setIdProduto(input.nextInt());
				
		System.out.println("Qual é o nome do produto: ");
		setNome(input.next());
		
		return this;
					
	}


}
