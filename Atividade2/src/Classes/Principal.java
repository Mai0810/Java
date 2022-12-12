package Classes;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo veiculo = new Veiculo();
		
				
		veiculo.setPlaca("AA8AB7A");
		veiculo.setMarca("GOL");
		veiculo.setModelo("G5");
		veiculo.setAno(2020);
		
		
		System.out.print("Placa: " + veiculo.getPlaca() + "\n"  
		+"Marca: " +	veiculo.getMarca() + "\n" 
		+ "Modelo: " + veiculo.getModelo() + "\n"
		+ "Ano: " + veiculo.getAno());

	}

}
