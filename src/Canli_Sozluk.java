import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Canli_Sozluk {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi alınız ve manasını alınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelime nin manasını yazıdırnız)
        // 5- Silme
        // 6- Çıkış

        System.out.println("***Canlı Sözlük Oluşturma Programına Hoşgeldiniz..!***");
        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);
        HashMap<String, String> sozluk = new HashMap<>();
        String kelime = "", manasi = "";
        int secim = 0;
        do {

            System.out.println("MENÜ\n 1-Ekleme\n 2-Düzeltme\n 3-Listeleme\n 4-Arama\n 5-Silme\n 6-Çıkış\n Seçiminiz = ");
            secim = okuInt.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Kelime = "); kelime = okuStr.nextLine();
                    System.out.print("Manası = "); manasi = okuStr.nextLine();
                    sozluk.put(kelime, manasi);
                    System.out.println("Ekleme İşlemi Yapılmıştır.");
                    break;
                case 2:
                    System.out.print("Düzletilecek Kelime ="); kelime = okuStr.nextLine();
                    if (sozluk.containsKey(kelime)) { // var ise düzelt
                        System.out.print("Manası = "); manasi = okuStr.nextLine();
                        sozluk.put(kelime, manasi);
                        System.out.println("Düzeltme İşlemi Yapılmıştır.");
                    } else // yok ise mesaj yaz
                        System.out.println("Kelime Bulunamadı.");

                    break;
                case 3:
                    for (Map.Entry<String, String> kelimeMana : sozluk.entrySet())
                        System.out.println(kelimeMana.getKey() + " - " + kelimeMana.getValue());
                    break;
                case 4:
                    System.out.print("Bulunacak Kelime = "); kelime = okuStr.nextLine();
                    if (sozluk.containsKey(kelime)) // var ise manayı göster
                        System.out.println(sozluk.get(kelime));
                    else // yok ise mesaj yaz
                        System.out.println("Kelime Bulunamadı");

                    break;
                case 5:
                    System.out.print("Silinecek Kelime = "); kelime = okuStr.nextLine();
                    if (sozluk.containsKey(kelime)) // var ise sil
                        sozluk.remove(kelime);
                    else // yok ise mesaj yaz
                        System.out.println("Kelime Bulunamadı");
                    break;
            }

            System.out.println("*******************");
        } while (secim != 6);

        System.out.println("Programdan Çıkıldı");
    }
}
