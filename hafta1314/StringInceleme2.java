package hafta1314;

public class StringInceleme2 {
    public static void main (String[] args) {
        // substring() - String'in bir parçasını kopyalayıp yeni bir String olarak döndürür.
        
        // 1 | substring(int baslangic) : Verilen indeksten başalyarak String'in sonuna kadar olan kısmı alır
        // 2 | substring(int baslangic, int bitis) : Verilen indeksten başar ve bitis indeksine kadar olan kısmı alır ancak ! bitiş indeksi dahil edilmez.

        String selam = "Merhaba, Dünya!";
        System.out.println(selam.substring(9));
        System.out.println(selam.substring(0,7)); // substring belirtilen bitiş indeksinden bir öncekini alır Merhaba 6 da bitiyor ama 7 ifadesini kullandık 
        

        String email = "burak.ustun@kodrix.net";
        System.out.println("Email: " + email);
        
        // 1. Adım "@" karaakterinin indexini bul
        int atIndeksi = email.indexOf("@");

        // 2. Adım 0. indeksten sonra "@" indeksine kadar olan kısmı al.
        String kullaniciAdi = email.substring(0,atIndeksi);
        System.out.println("Kullanıcı Adı: " + kullaniciAdi);

        // Bonus: Sadece domain adını alalım.
        // "@" indeksinden bir sonraki karakterleden başla ve sonuna kadar git
        String domain = email.substring(atIndeksi+1);
        System.out.println("Domain: " + domain);
    }   
    
}
