//LAB 6 (MEMUR)
public class Memur extends Çalışan{
    private String departman;
    private int mesai;
    
    public static void calis()
    {
        System.out.println("Çalış!!");
    }
    
    @Override
    public void yaz()
    {
        System.out.println("----------MEMUR-----------");
        System.out.println("Ad Soyad = "+getAdSoyad());
        System.out.println("E-Posta = "+getEposta());
        System.out.println("Telefon = "+getTelefon());
        System.out.println("Departman = " + getDepartman());
        System.out.println("Mesai = " + getMesai()+"\n");
        giris();yemekhane();calis();cikis();
        System.out.println("--------------------------\n");
    }

    public Memur(String departman, int mesai, String adSoyad, String eposta, long telefon) {
        super(adSoyad, eposta, telefon);
        this.departman = departman;
        this.mesai = mesai;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public int getMesai() {
        return mesai;
    }

    public void setMesai(int mesai) {
        this.mesai = mesai;
    }
    
}
