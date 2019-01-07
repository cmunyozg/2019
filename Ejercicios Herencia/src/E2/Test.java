package E2;

public class Test {
	public static void main(String[] args) {
		
		Cuenta n = new Cuenta ("Carlos", 100);
		
		
		Credito credito1 = new Credito(n);
		System.out.println(credito1.toString());
		Debito debito1 = new Debito(n);
		
		credito1.pagoCuenta(1300);
		
		
		System.out.println(credito1.pagoCredito(1000));

		credito1.cargoFinMes();
		System.out.println(debito1.toString());
		
	}
}

//Tarjeta: PagoCuenta();
//Debito: cuota
//Credito: Limite, interes, cargoFinMes(), pagoCredito() (Si he superado el limite llamo a PagoCuenta.)