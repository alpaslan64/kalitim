//LAB 6 (ÇALIŞAN)
public class Çalışan {
    private String adSoyad;
    private String eposta;
    private long telefon;
       
    public static void giris(){
        System.out.println("Giriş Yapıldı!!");
    }
    public static void cikis(){
        System.out.println("Çıkış Yapıldı!!");
    }
    public static void yemekhane(){
        System.out.println("Yemek Yenildi!!");
    }
    
    public void yaz()
    {
        System.out.println("---------ÇALIŞAN---------");
        System.out.println("Ad Soyad = "+adSoyad);
        System.out.println("E-Posta = "+eposta);
        System.out.println("Telefon = "+telefon+"\n");
        giris();yemekhane();cikis();
        System.out.println("--------------------------\n");
    }
    
    public Çalışan(String adSoyad, String eposta, long telefon) {
        this.adSoyad = adSoyad;
        this.eposta = eposta;
        this.telefon = telefon;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public double getTelefon() {
        return telefon;
    }

    public void setTelefon(long telefon) {
        this.telefon = telefon;
    }
}
