package classes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pedido {
	private String vendedor;
	private String observacoes;
	private boolean status;
	private Date dataPedido;
	
	
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	public boolean isStatus() {
		return status;
	}
		public void setStatus(boolean status) {
		this.status = status;
	}
		
	public Date getDataPedido() {
		return dataPedido;
	}
	
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	
	
	
	public void criarPedido(Cliente cliente) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Qual é a data do pedido:(coloque nesse formato: dd/mm/yyyy) ");
		String dn = input.next(); // dd/mm/yyyy
		Date dataPedido;
		try {
			dataPedido = new SimpleDateFormat("dd/MM/yyyy").parse(dn);
			this.setDataPedido (dataPedido);	
		} catch (ParseException e2) {
		}
		
		
		System.out.println("Qual é o vendedor: ");
		String v = input.next();
		setVendedor( v ); 
		
		
		System.out.println("Qual é o status do pedido: ");
		setStatus(input.nextBoolean());
		
		
		System.out.println("Quais são as observações: ");
		setObservacoes(input.next());
		

    }
}
	
