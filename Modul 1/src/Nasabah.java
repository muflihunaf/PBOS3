
public class Nasabah {
	String Nama,Alamat,NoTelp,Rekening;

	public Nasabah(String nama, String alamat, String noTelp, String rekening) {
		this.Nama = nama;
		this.Alamat = alamat;
		this.NoTelp = noTelp;
		this.Rekening = rekening; 
	}
	public void tampil(double saldo) {
		System.out.println("==============================" );
		System.out.println("Nama Nasabah: " + this.Nama);
		System.out.println("Alamat: " + this.Alamat);
		System.out.println("Nomor Telepon: " + this.NoTelp);
		System.out.println("Saldo: Rp." + saldo);
		System.out.println("==============================" );
		
	}
	
	public static void main(String [] args) {
//		Membuat Object nasabah Baru
		Nasabah nasabah1 = new Nasabah("Zulvan", "Bojonegoro", "081554318322", "371231232");
		Nasabah nasabah2 = new Nasabah("Firman", "Pacet", "081554318322", "3712921382");
//		Membuat Object Rekening
		Rekening noRek1 = new Rekening(nasabah1.Rekening, 0);
		nasabah1.tampil(noRek1.saldo);
		noRek1.tambahRekening(50000);
		nasabah1.tampil(noRek1.saldo);
		noRek1.ambilRekening(3000);
		nasabah1.tampil(noRek1.saldo);
		
//		Membuat Object Rekening
		Rekening noRek2 = new Rekening(nasabah2.Rekening, 0);
		
		nasabah2.tampil(noRek2.saldo);
		noRek2.tambahRekening(150000);
		nasabah2.tampil(noRek2.saldo);
		noRek2.ambilRekening(50000);
		nasabah2.tampil(noRek2.saldo);
		
		nasabah1.tampil(noRek1.saldo);
		nasabah2.tampil(noRek2.saldo);
		
		
		
	}
	
}
