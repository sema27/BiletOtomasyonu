
public abstract class  Arac {
	public double yakit;
	public double ucret;
	public double sure;
	public int saat;
	public int dakika;
	 
	public Arac() {
		
	}
	
	public abstract void sureHesapla(double km); 
	
	public abstract void yakitHesapla(double km);
	
	public abstract double ucretHesapla(double km,double yakit);

}
