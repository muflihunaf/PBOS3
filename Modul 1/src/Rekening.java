
public class Rekening {
	String NoRekening;
	double saldo;

	public Rekening(String noRekening, double saldo) {
		this.NoRekening = noRekening;
		this.saldo = saldo;
	}
	
	public double tambahRekening(double saldo) {
		this.saldo = this.saldo + saldo;
		return this.saldo;
	}
	public double ambilRekening(double saldo) {
		this.saldo = this.saldo - saldo;
		return this.saldo;
	}
	
	
}
