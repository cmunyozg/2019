package E1;

public class Factura extends Precio{

	private String emisor;
	private String cliente;
	
	
	public Factura(String emisor, String cliente, float euros) {
		super(euros);
		this.emisor = emisor;
		this.cliente = cliente;
		
	}
	
	public void imprimirFactura() {
		
		System.out.println("Emisor: " + emisor + "\n" +
							"Cliente: " + cliente + "\n" +
							"Precio: " + euros + "€");
		
	}
	
}
