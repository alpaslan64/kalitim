//LAB 6 (AKADEMİSYEN)
public class Akademisyen extends Çalışan{
    private String bolum;
    private String unvan;

    public static void derseGir()
    {
        System.out.println("Derse Gir!!");
    }
    
    @Override
    public void yaz()
    {
        System.out.println("-------AKADEMİSYEN--------");
        System.out.println("Ad Soyad = "+getAdSoyad());
        System.out.println("E-Posta = "+getEposta());
        System.out.println("Telefon = "+getTelefon());
        System.out.println("Bölüm = " + getBolum());
        System.out.println("Unvan = " + getUnvan()+"\n");
        giris();yemekhane();derseGir();cikis();
        System.out.println("--------------------------\n");
    }
    
    public Akademisyen(String bolum, String unvan, String adSoyad, String eposta, long telefon) {
        super(adSoyad, eposta, telefon);
        this.bolum = bolum;
        this.unvan = unvan;
    }
    
        public String getBolum() {
        return bolum;
    }

    public String getUnvan() {
        return unvan;
    }
  
}
