
public class Otobus extends Arac{
	
	public Otobus() {
		
	}
	@Override
	public void sureHesapla(double km) {
		sure = km * 1.1;
		saat = (int)(sure/60);
		dakika = (int)(sure%60);
		if(saat == 0) {
			System.out.println("Süre: "+dakika+" Dakika");
		}
		else {
			System.out.println("Süre: "+saat+" Saat "+dakika+" Dakika");
		}
	}
	
	@Override
	public void yakitHesapla(double km) {
		yakit = km*4;
		ucretHesapla(km,yakit);
		sureHesapla(km);
	}
	
	@Override
	public double ucretHesapla(double km,double yakit) {
		ucret = (yakit/4) * 0.75;
		return ucret;
		
	}
	
	
	
public void yasSorgu(int yas) {
		
		if(yas>0 && yas<=11) {
		Cocuk cocuk = new Cocuk();
		cocuk.cocukUcret(ucret);
		
	}
	else if(yas>11 && yas<=22) {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.ogrenciUcret(ucret);
		
	}
	else {
		Yetiskin yetiskin = new Yetiskin();
		yetiskin.yetiskinUcret(ucret);
		
	}
	}

}
