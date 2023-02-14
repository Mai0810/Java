package aula03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Socio {
	
	private String nome;
	private String endereço;
	private int telefone;
	private Date datanascimento;
	private Dependente dependente;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public Date getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(Date datanascimento) {
		this.datanascimento = datanascimento;
	}
	public Dependente getDependente() {
		return dependente;
	}
	public void setDependente(Dependente dependente) {
		this.dependente = dependente;
	}
	public boolean registrar() {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Qual é o seu nome: ");
		String s = input.next();
		this.setNome( s );
		
		System.out.println("Qual é o seu endereço: ");
		String e = input.next();
		this.setEndereço ( e );
		
		System.out.println("Qual é o seu telefone: ");
		this.setTelefone(input.nextInt());
		
		System.out.println("Qual é a sua data de nascimento:(coloque nesse formato: dd/mm/yyyy) ");
		String dn = input.next(); // dd/mm/yyyy
		Date dataDeNascimento;
		try {
			dataDeNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dn);
			this.setDatanascimento (dataDeNascimento);	
		} catch (ParseException e2) {
		}
		
		
		
		System.out.println("Você possui algum dependente? (1:Sim ou 2:Não) ");
		int resposta = input.nextInt();
		if (resposta == 1) {
			Dependente d = new Dependente();
			
			System.out.println("Qual é o nome do seu dependente: ");
			d.setNome(input.next());
			
			System.out.println("Qual é a data de nascimento do seu dependente:(coloque nesse formato: dd/mm/yyyy) ");
			String dnd = input.next(); // dd/mm/yyyy
			Date dnDependente;
			try {
				dnDependente = new SimpleDateFormat("dd/MM/yyyy").parse(dnd);
				d.setData(dnDependente);
			} catch (ParseException e1) {
			}
			
			this.setDependente(d);
			
		}
		 
		
		return true;
	}   	
	
}




