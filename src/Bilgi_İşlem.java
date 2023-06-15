//LAB 6 (BİLGİ İŞLEM)
public class Bilgi_İşlem extends Memur {
    String gorev;
    
    public static void netwrokKurulum()
    {
        System.out.println("Network Kurulumunu Gerçekleştir!!");
    }
    
    @Override
    public void yaz()
    {
        System.out.println("--------BİLG. İŞL.--------");
        System.out.println("Ad Soyad = "+getAdSoyad());
        System.out.println("E-Posta = "+getEposta());
        System.out.println("Telefon = "+getTelefon());
        System.out.println("Departman = " + getDepartman());
        System.out.println("Mesai = " + getMesai());
        System.out.println("Gorev = " + getGorev()+"\n");
        giris();yemekhane();calis();netwrokKurulum();cikis();
        System.out.println("--------------------------\n");
    }

    public Bilgi_İşlem(String gorev, String departman, int mesai, String adSoyad, String eposta, long telefon) {
        super(departman, mesai, adSoyad, eposta, telefon);
        this.gorev = gorev;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
}
