//LAB 6 (ÖĞRETİM GÖREVLİSİ)
public class Öğretim_Görevlisi extends Akademisyen{
    private int kapiNo;
    
    public static void senatoToplantı()
    {
        System.out.println("Toplantı Saati!!");
    }
    
    public static void sinavYap()
    {
        System.out.println("Sınav Haftası!!");
    }
    
    @Override
    public void yaz()
    {
        System.out.println("--------ÖĞR. GÖR.---------");
        System.out.println("Ad Soyad = "+getAdSoyad());
        System.out.println("E-Posta = "+getEposta());
        System.out.println("Telefon = "+getTelefon());
        System.out.println("Bölüm = " + getBolum());
        System.out.println("Unvan = " + getUnvan());
        System.out.println("Kapı No = " + getKapiNo()+"\n");
        giris();yemekhane();derseGir();senatoToplantı();sinavYap();cikis();
        System.out.println("--------------------------\n");
    }

    public Öğretim_Görevlisi(int kapiNo, String bolum, String unvan, String adSoyad, String eposta, long telefon) {
        super(bolum, unvan, adSoyad, eposta, telefon);
        this.kapiNo = kapiNo;
    }

    public int getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(int kapiNo) {
        this.kapiNo = kapiNo;
    }
    
    
}
