package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class ItemPedido {
	private int quantidade;
	private float preco;
	private List<Produto> listaDeProdutos = new ArrayList<Produto>();
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}

	public List<Produto> incluirItem(Produto produto) {
		Scanner input = new Scanner (System.in);
				
		System.out.println("Qual é o preço do item: ");
		setPreco(input.nextFloat());
		
		System.out.println("Qual é a quantidade dos itens: ");
		setQuantidade(input.nextInt());	
		
		listaDeProdutos.add(produto);	
		return listaDeProdutos;
    }
	

}
