package E2;

public class Tarjeta {

	protected String titular;
	protected int numero;
	protected static float saldo;

	private static int numeroBase = 2000000;

	public Tarjeta(Cuenta cuenta) {
		this.titular = cuenta.getTitular();
		saldo = cuenta.getSaldo();
		this.numero = numeroBase;
		numeroBase++;
	}

	public static boolean pagoCuenta(float cantidad) {
		if (cantidad <= saldo) {
			saldo -= cantidad;
			return true;
		} else
			return false;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public String toString() {

		return "Titular: " + titular + "\n" + "Número Tarjeta: " + numero + "\n" + "Saldo: " + saldo + "€";

	}
}