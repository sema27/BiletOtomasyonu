import java.util.Scanner;
public class Kisi {
	public int secim;
	public double kilometre;
	private String isim;
	private String mail; 
	private String telNo;
	private String soyIsim;
	private int yas;
	private String tcNo;
	int sayi;
	double tutar;
	int secim2;
	String kupon;
	String indirimKodu;
	Scanner scan = new Scanner(System.in);

	public Kisi() {
		
		
	}
	
	public Kisi(String isim,String soyIsim,int yas) {
		isim = this.getIsim();
		soyIsim = this.getSoyIsim();
		yas = this.getYas();
	}
	
	public void kuponYazdirma() {
		System.out.println("**********KUPON BİLGİLERİNİZ**********");
		System.out.println("İsim :"+getIsim());
		System.out.println("Soyisim :"+getSoyIsim());
		System.out.println("Yas :"+getYas());
		if (yas > 11) {
		System.out.println("Telefon Numarası :"+getTelNo());
		}
		if(secim2 == 1) {
		System.out.println("Mail Adresi :"+getMail());
		System.out.println("TC Kimlik Numarası :"+getTcNo());
		}
		if(secim == 1) {
		System.out.println("Yolculuk Edeceğiniz Araç :Tren");
		}
		if(secim == 2) {
	    System.out.println("Yolculuk Edeceğiniz Araç :Otobüs");
		}
		if(secim == 3) {
		System.out.println("Yolculuk Edeceğiniz Araç :Uçak");
		}
		System.out.println("**************************************");
		
	}
	
	public void kullaniciBilgisi() {
		System.out.println("*****HOŞGELDİNİZ*****");
		Scanner scan = new Scanner(System.in);
		System.out.println("İsim :");
		isim = scan.nextLine();
		System.out.println("Soyisim :");
		soyIsim = scan.next();
		System.out.println("Yaş :");
		yas = scan.nextInt();
		if (yas > 11) {
		System.out.println("Telefon Numaranız :");
		telNo = scan.next();
		}
		}
	    
		public double kmSorgusu() {
		System.out.println("GİDECEĞİNİZ KİLOMETREYİ GİRİNİZ:");
		kilometre = scan.nextDouble();
		return kilometre;
	    }
		
	    public void indirim() {
	    	System.out.println("İndirim Kupon Kodunuz Varsa Giriniz,Yoksa 0 Giriniz: ");
			Scanner klavye = new Scanner(System.in);
			kupon = klavye.next();
			if(kupon.equals(indirimKodu)) {
				System.out.println("İNDİRİM KODUNUZ DOĞRULANDI");
				System.out.println("BİLET KUPONUNUZ OLUŞTURULDU.1 AY İÇİNDE TÜM YOLCULUKLARINIZDA KULLANABİLİRSİNİZ.");
			}
			else{
				System.out.println("İNDİRİM KODUNUZ DOĞRULANAMADI");
				System.out.println("BİLET KUPONUNUZ OLUŞTURULDU.1 AY İÇİNDE TÜM YOLCULUKLARINIZDA KULLANABİLİRSİNİZ.");
			}
	    }
	    public class KaydaOzel{
	    public void cark() {
		sayi = (int)(Math.random()*50+1);
		System.out.println("% "+sayi+" İndirim Kazandınız");
		indirimKodu = sayi + getIsim().substring(0, 1) + getSoyIsim().substring(0, 1) + getYas();
		System.out.println("İndirim Kodunuz: "+indirimKodu);
	}
	    }

		public void aracSec() throws Exception{
		System.out.println("HANGİ ARAÇLA YOLCULUK ETMEK İSTERSİNİZ?");
		System.out.println();
		System.out.println("TREN İÇİN    -----> 1'i TUŞLAYINIZ.");
		System.out.println("OTOBÜS İÇİN  -----> 2'yi TUŞLAYINIZ.");
		System.out.println("UÇAK İÇİN    -----> 3'ü TUŞLAYINIZ.");
		secim = scan.nextInt();
		if(secim == 1) {
			Tren tren = new Tren();
			tren.yakitHesapla(kilometre);
			tren.yasSorgu(yas);
		}
		else if(secim == 2) {
			Otobus otobus = new Otobus();
			otobus.yakitHesapla(kilometre);
			otobus.yasSorgu(yas);
		}
		else if(secim == 3) {
			Ucak ucak = new Ucak();
			ucak.yakitHesapla(kilometre);
			ucak.yasSorgu(yas);
		}
		else {
			throw new Exception("Geçersiz Bir Tuşlama Yaptınız!"); 
		}
	}
	public void kayitSorgusu() throws Exception{
		System.out.println("İNDİRİMDEN FAYDALANMAK İÇİN KAYIT OLMAK İSTER MİSİNİZ?");
		System.out.println("EVET İÇİN 1'i,HAYIR İÇİN 2'yi TUŞLAYINIZ");
		Scanner scan = new Scanner(System.in);
		secim2=scan.nextInt();
		if(secim2==1) {
			kayitOl();
			
		}
		else if(secim2==2) {
			System.out.println("İNDİRİMDEN FAYDALANAMADINIZ:(");
		}
		else {
			throw new Exception("Geçersiz Bir Tuşlama Yaptınız!"); 
		}
	}

	public void kayitOl() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Mail Adresiniz :");
		mail = scan.next();
		System.out.println("TC Kimlik Numaranız :");
		tcNo = scan.next();
		System.out.println("Kaydınız Tamamlanmıştır.");
		System.out.println("Mail Adresinizden Kayıt Bilgilerinizi Kontrol Edebilirsiniz.");
		KaydaOzel kaydaOzel = new KaydaOzel();
		kaydaOzel.cark();
	}
	
	

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyIsim() {
		return soyIsim;
	}

	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

}
