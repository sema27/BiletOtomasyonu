
public class Yetiskin extends Kisi{
	private String telNo;
	public Yetiskin() {
		
	}
	
	public Yetiskin(String isim,String soyIsim) {
		isim = this.getIsim();
		soyIsim = this.getSoyIsim();
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public  double yetiskinUcret(double a) {
		a = a * 1;
		System.out.println("Ödeyeceğiniz Ücret: "+a+" TL");
		return a;
	}

}
