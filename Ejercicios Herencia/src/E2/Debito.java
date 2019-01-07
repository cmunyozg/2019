package E2;

public class Debito extends Tarjeta {

	private float cuota;
	
	public Debito (Cuenta cuenta) {
		super (cuenta);
		cuota = 20;
	}
	
	public Debito (Cuenta cuenta, float cuota) {
		super (cuenta);
		this.cuota = cuota;
	}
	
	public void pagoCuota(){
		saldo -=cuota;
	}
	
	public float getCuota() {
		return cuota;
	}
	
	public void setCuota(float cuota) {
		this.cuota = cuota;
	}
	public String toString() {

		return "Titular: " + titular + "\n" + "Número Tarjeta: " + numero + "\n" + "Tipo: Débito" + "\nSaldo Cuenta: " + saldo + "€";

	}
}
