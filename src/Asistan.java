//LAB 6 (ASİSTAN)
public class Asistan extends Akademisyen{
    int ofisSaati;
    
    public static void quizYap()
    {
        System.out.println("Quiz Yap!!");
    }
    
    @Override
    public void yaz()
    {
        System.out.println("---------ASİSTAN----------");
        System.out.println("Ad Soyad = "+getAdSoyad());
        System.out.println("E-Posta = "+getEposta());
        System.out.println("Telefon = "+getTelefon());
        System.out.println("Bölüm = " + getBolum());
        System.out.println("Unvan = " + getUnvan());
        System.out.println("Ofis Saati = " + getOfisSaati()+"\n");
        giris();yemekhane();derseGir();quizYap();cikis();
        System.out.println("--------------------------\n");
    }
    
    public Asistan(int ofisSaati, String bolum, String unvan, String adSoyad, String eposta, long telefon) {
        super(bolum, unvan, adSoyad, eposta, telefon);
        this.ofisSaati = ofisSaati;
    }

    public int getOfisSaati() {
        return ofisSaati;
    }

    public void setOfisSaati(int ofisSaati) {
        this.ofisSaati = ofisSaati;
    }
    
    
}
