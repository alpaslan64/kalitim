//LAB 6 (UYGULAMA)
public class UYGULAMA {
    public static void main(String[] args) {
        Çalışan çal1 = new Çalışan("Alp Aslan", "alp.aslan@gmail.com", 546123);
        çal1.yaz();
        Akademisyen ak1 = new Akademisyen("BGV", "Öğr. Gör.", "Ali Taş", "ali.tas@gmail.com", 123414);
        ak1.yaz();
        Memur me1 = new Memur("Bilgi İşlem", 8, "Mehmet Elmas", "mehmet.elmas@gmail.com", 3456545);
        me1.yaz();
        Öğretim_Görevlisi öğr1 = new Öğretim_Görevlisi(101, "İnt. Prog.", "Dr. Öğr. Üyesi", "Ahmet Keskin", "ahmet.keskin@gmail.com", 123123);
        öğr1.yaz();
        Asistan as1 = new Asistan(4, "Ağ Tek.", "Araş. Gör.", "Bilal Demir", "bilal.demir@gmail.com", 78768456);
        as1.yaz();
        Lab_Asistanı lab1 = new Lab_Asistanı(5, "BGV", "Ögr. Gör.", "Nur Kaya", "nur.kaya@gmail.com", 46523461);
        lab1.yaz();
        Bilgi_İşlem bilg1 = new Bilgi_İşlem("Sunucu", "Bilgi İşl.", 6, "Ece Çan", "ece.can@gmail.com", 1236572241);
        bilg1.yaz();
        Güvenlik_Görevlisi güv1 = new Güvenlik_Görevlisi("Giriş Çıkış Belgesi", "Güvenlik", 12, "Hakan Cesur", "hakan.cesur@gmail.com", 87324928);
        güv1.yaz();
        
    }
}
