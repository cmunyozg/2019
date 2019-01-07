package E2;

public class Cuenta {

	private static int cuentaBase = 1000000;

	private String titular;
	private int numero;
	private float saldo;

	public Cuenta() {

	}

	public Cuenta(String titular) {
		numero = cuentaBase;
		cuentaBase++;
		this.titular = titular;

	}

	public Cuenta(String titular, float saldo) {
		numero = cuentaBase;
		cuentaBase++;
		this.titular = titular;
		this.saldo = (saldo > 0) ? saldo : 0;

	}

	public boolean reintegro(float cantidad) {

		boolean realizado = false;

		if (saldo > cantidad && cantidad > 0) {
			saldo -= cantidad;
			realizado = true;
		}

		return realizado;
	}

	public boolean ingreso(float cantidad) {

		boolean realizado = false;

		if (cantidad > 0) {
			saldo += cantidad;
			realizado = true;
		}

		return realizado;
	}

	public String getTitular() {
		return titular;
	}

	public int getNumero() {
		return numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public String toString() {
		return "Titular: " + titular + "\n" + "Numero Cuenta: " + numero + "\n" + "Saldo: " + saldo;
	}
}
