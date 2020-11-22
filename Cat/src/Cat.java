import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Cat {
	private String nama;
	private LocalDate lahir;
	
	
	public Cat(String nama, String lahir) {
		this.nama = nama;
		DateTimeFormatter format = DateTimeFormatter.ofPattern("d-MM-yyyy");
		this.lahir = LocalDate.parse(lahir,format);
	}
	
	public void getTahun() {
		System.out.println(this.lahir.getYear());
	}
	
	public void getNama() {
		System.out.println(this.nama);
	}
	public void getUmur() {
		LocalDate sekarang = LocalDate.now();
		Period p = Period.between(this.lahir,sekarang);
		System.out.println("Umur Kucing: " + p.getYears());
	}
	
}
