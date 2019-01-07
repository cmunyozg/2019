package E2;

public class Credito extends Tarjeta {

	private float limite;
	private float gastoAcumuladoMes;
	private float interes;

	public Credito(Cuenta cuenta) {
		super(cuenta);
		limite = 1000;
		interes = 0.01f;
	}

	public Credito(Cuenta cuenta, float limite) {
		super(cuenta);
		this.limite = limite;
		interes = 0.01f;
	}

	public boolean pagoCredito(float cantidad) {
		if (cantidad + gastoAcumuladoMes <= limite) {
			gastoAcumuladoMes += cantidad;
			return true;
		} else pagoCuenta(cantidad);
			return (pagoCuenta(cantidad)) ? true : false;
	}
	
	public boolean cargoFinMes() {
		float intereses = gastoAcumuladoMes*interes;
		saldo -=(gastoAcumuladoMes+intereses);
		return true;
	}

	public float getLimite() {
		return limite;
	}

	public float gastoAcumuladoMes() {
		return gastoAcumuladoMes;
	}

	public float interes() {
		return interes;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public void setInteres(float interes) {
		this.interes = interes;
	}

	public String toString() {

		return "Titular: " + titular + "\n" + "Número Tarjeta: " + numero + "\n" + "Tipo: Crédito\n" + "Gasto acumulado mensual: " + gastoAcumuladoMes
				+ "€" + "\nLímite mensual: " + limite + "€"+"\nSaldo Cuenta: " + saldo + "€";

	}
}
