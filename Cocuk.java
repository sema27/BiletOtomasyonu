
public class Cocuk extends Kisi{
	public Cocuk() {
		
		
	}
	
	public Cocuk(String isim,String soyIsim) {
		isim = this.getIsim();
		soyIsim = this.getSoyIsim();
	}
	
	public double cocukUcret(double a) {
		a = a * 0.5;
		System.out.println("Ödeyeceğiniz Ücret: "+a+" TL");
		return a;
		
	}
	
}
