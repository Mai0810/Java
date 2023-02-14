package aulaHeranca.principal;

import aulaHeranca.Carro;
import aulaHeranca.Moto;
import aulaHeranca.Barco;
public class Principal {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.setMarca("Fusca");
		carro.setQtdPortas(2);
		
		Moto moto = new Moto();
		moto.setMarca("Scooter");
		moto.setQtdCilindrada(100);
		
		Barco barco = new Barco();
        barco.setMarca("Barco");
        barco.setPotMotor(50);
        
        System.out.println("Carro" + "\n" +
        "Marca: " + carro.getMarca() + "\n" +
        "Quantidade de portas: " + carro.getQtdPortas());
        
        System.out.println("Moto" + "\n" +
        "Marca: " + moto.getMarca() + "\n" +
        "Quantidade de cilindradas: " + moto.getQtdCilindrada());
        
        System.out.println("Barco" + "\n" +
        "Marca: " + barco.getMarca() + "\n" +
        "Potência do motor do barco:" + barco.getPotMotor());
                           
        
	}

}
