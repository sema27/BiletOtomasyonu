
public class Ogrenci extends Kisi{
	private String telNo;
	public Ogrenci() {
		
	}
	public Ogrenci(String isim,String soyIsim) {
		isim = this.getIsim();
		soyIsim = this.getSoyIsim();
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public double ogrenciUcret(double a) {
		a = a * 0.75;
		System.out.println("Ödeyeceğiniz Ücret: "+a+" TL");
		return a;
	}
	


}
