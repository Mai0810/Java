package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Cliente {
	private int idCliente;
	private String nome;
	private String contato;
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	
	public Cliente cadastrarCliente() {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Qual é o ID do cliente:");
		setIdCliente(input.nextInt());
				
		System.out.println("Qual é o nome do cliente: ");
		String s = input.next();
		setNome( s ); 
		
		System.out.println("Qual é o contato do cliente: ");
		String e = input.next();
		setContato( e );
		
		return this;
					
		}
		
	
}
