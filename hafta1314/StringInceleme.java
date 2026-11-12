package hafta1314;

public class StringInceleme {
    public static void main(String[] args) {            
        String isim = "Burak";
        Math.random(); // Sınıfa atanan bir metod
        
        // String nesnesine atanan metodlara bakıcaz.

        String mesaj1 = "Merhaba, Dünya!";
        String mesaj2 = new String("AP COMPUTER SCIENCE");
        String mesaj3 = "Merhaba Dünya!";
        String mesaj4 = new String("AP COMPUTER SCIENCE");

        // Özellik              "Java"                      new String("Java")
        // Nesne Olşturma       Havuzdan Kullanır           Her Seferinde yeni nesne
        // Bellek Kullanma      Daha verimli                Ek nesne oluştutur
        // == Karşılaştırma     Referansları karşılaştırır  Referansları karşılaştıorır
        // .equals()            İçeriği karşılaştırır       İçeriği karşılaştırır


        // Nesne Metodlarını Çağırmak(Instance Methods)
        // length(): String'in karakter sayısının uzunluğunu int olarak döndürür
        // indexOf(Strin aranan): aranan metnin, string içinde ilk geçtiği yerin başlangıç indeksini int olarak döndürür eğer yoksa -1 döndürür.

        String metin = "Merhabalar, Benim Adım Burak";
        
        // length() Metodu
        int uzunluk = metin.length(); // length metodu nesneye atanan bir metod. belirtlilen stringte kullanılan karakter sayısını verir.
        System.out.println("Cümlenin Uzunluğu: " + uzunluk);

        // indexOf() Metodu
        int p_indeksi = metin.indexOf("Burak"); // String ifadelerde her karakter 0 dan başlayarak numaralandırılır. 
        System.out.println("'Burak' kelimesinin başlangıç indeksi: " + p_indeksi);

        int p_indeksi2 = metin.indexOf("Ahmet"); // String ifadelerde her karakter 0 dan başlayarak numaralandırılır. 
        System.out.println("'Ahmet' kelimesinin başlangıç indeksi: " + p_indeksi2);
    }
}
