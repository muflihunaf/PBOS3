import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	
	public static void main(String[] args) {
		String namaDriver = "Firman";
		String namaPenumpang = "Uzaki";
		LocalDate sekarang = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MM-yyyy");
		String tanggal = sekarang.format(formatter);
		Taxi taxi1 = new Taxi(namaPenumpang,namaDriver,tanggal);
		taxi1.hitungJarak(1);
		taxi1.hitungBiaya();
		taxi1.deskripsi();
	}
}
