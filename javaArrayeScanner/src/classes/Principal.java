package classes;


/* Aluna:Maize Rodrigues dos Santos */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente = cliente.cadastrarCliente();
		
		Pedido pedido = new Pedido ();
		pedido.criarPedido(cliente);
		
		List<Produto> listaProdutos = new ArrayList<Produto>();
		
		ItemPedido itemPedido = new ItemPedido();
		
		Scanner input = new Scanner (System.in);
		System.out.println("Qual é a quantidade de produtos que serão incluídos neste pedido?");
		int qtdProdutos = input.nextInt();
		
		for(int i = 0 ; i < qtdProdutos ; i++) {
			Produto produto = new Produto();
			produto = produto.incluirProduto();
			
			listaProdutos = itemPedido.incluirItem(produto);
		
		}
		
		System.out.println("Informações do pedido");

		System.out.println("nome do cliente " + cliente.getNome());
		
		System.out.println(" data pedido: " + pedido.getDataPedido());
		
		
	

	}

}
