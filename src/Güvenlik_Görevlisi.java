//LAB 6 (GÜVENLİK GÖREVLİSİ)
public class Güvenlik_Görevlisi extends Memur{
    String belge;
    
    public static void nobet()
    {
        System.out.println("Nobet Zamanı!!");
    }
    
    @Override
    public void yaz()
    {
        System.out.println("--------GÜV. GÖR.---------");
        System.out.println("Ad Soyad = "+getAdSoyad());
        System.out.println("E-Posta = "+getEposta());
        System.out.println("Telefon = "+getTelefon());
        System.out.println("Departman = " + getDepartman());
        System.out.println("Mesai = " + getMesai());
        System.out.println("Belge = " + getBelge()+"\n");
        giris();yemekhane();calis();nobet();cikis();
        System.out.println("--------------------------\n");
    }

    public Güvenlik_Görevlisi(String belge, String departman, int mesai, String adSoyad, String eposta, long telefon) {
        super(departman, mesai, adSoyad, eposta, telefon);
        this.belge = belge;
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }
    
    
}
