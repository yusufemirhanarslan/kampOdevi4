package odevCamp4;

public class EDevletInfo {
	
	String tcNo;
	String ad;
	String soyad;
	String dogumTarihi;
	
	public EDevletInfo() {
		
	}

	public EDevletInfo(String tcNo, String ad, String soyad, String dogumTarihi) {
		super();
		this.tcNo = tcNo;
		this.ad = ad;
		this.soyad = soyad;
		this.dogumTarihi = dogumTarihi;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(String dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

}
