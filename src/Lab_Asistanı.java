//LAB 6 (LAB ASİSTANI)
public class Lab_Asistanı extends Asistan{
    public static void lablaraGir()
    {
        System.out.println("Laboratuarlara Gir!!");
    }
    
    @Override
    public void yaz()
    {
        System.out.println("--------LAB. ASİS.--------");
        System.out.println("Ad Soyad = "+getAdSoyad());
        System.out.println("E-Posta = "+getEposta());
        System.out.println("Telefon = "+getTelefon());
        System.out.println("Bölüm = " + getEposta());
        System.out.println("Unvan = " + getUnvan()+"\n");
        giris();yemekhane();derseGir();quizYap();lablaraGir();cikis();
        System.out.println("--------------------------\n");
    }
    public Lab_Asistanı(int ofisSaati, String bolum, String unvan, String adSoyad, String eposta, long telefon) {
        super(ofisSaati, bolum, unvan, adSoyad, eposta, telefon);
    }
}
