public class Main {
    public static void main(String[] args) {
        int toplam = 0;
        
        // 1'den 20'ye kadar olan sayıları döngüye alıyoruz
        for (int i = 1; i <= 20; i++) {
            // Çift sayıları kontrol ediyoruz (2, 4, 6, ..., 20)
            if (i % 2 == 0) {
                // Sayının küpünü alıp toplama ekliyoruz (i * i * i veya Math.pow kullanılabilir)
                toplam += (i * i * i);
            }
        }
        
        // Sonucu ekrana yazdırıyoruz
        System.out.println("1'den 20'ye kadar olan çift sayıların küplerinin toplamı: " + toplam);
    }
}