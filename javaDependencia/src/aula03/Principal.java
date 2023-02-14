package aula03;

public class Principal {

	public static void main(String[] args) {
		Socio socio = new Socio();
		boolean retorno = socio.registrar();
		if(retorno == true) { 
			System.out.println("O Sócio foi cadastrado com sucesso");
			if(socio.getDependente() != null) {
				System.out.println("O seu dependente foi cadastrado com sucesso");	
			}
		} 
	}

}
