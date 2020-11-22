
public class Taxi {
	private String namaPenumpang,namaDriver,tanggal;
	private int jarak;
	private double total;
	
	public Taxi(String namaPenumpang,String namaDriver, String tanggal) {
		this.namaPenumpang = namaPenumpang;
		this.namaDriver = namaDriver;
		this.tanggal = tanggal;
	}
	
	public int hitungJarak(int jarak) {
		this.jarak = jarak;
		return jarak;
	}
	
	public double hitungBiaya() {
		double biaya = 5000;
		if (this.jarak <= 10) {
			biaya = biaya + (3500 * this.jarak);
		}else if(this.jarak <= 20) {
			biaya = biaya + 35000 +(2500 * this.jarak);
		}else {
			biaya = biaya + 35000 + 25000 + (2000 * this.jarak);
		}
		this.total = biaya;
		return biaya;		
	}
	public void deskripsi() {
		System.out.println("Nama Driver: " + this.namaDriver);
		System.out.println("Nama Penumpang: " + this.namaPenumpang);
		System.out.println("Tanggal: " + this.tanggal);
		System.out.println("Jarak Yang Ditempuh: " + this.jarak);
		System.out.println("Total Biaya: " + this.total);
	}
}
