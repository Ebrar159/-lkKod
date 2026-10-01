public class Main {
    public static void main(String[] args) {
        int toplam = 0;
        for (int i = 1; i <= 20; i++) {
            // Çift sayıları kontrol ediyoruz (2, 4, 6, ..., 20)
            if (i % 2 == 0) {
                toplam += (i * i * i);
            }
        }
        System.out.println("1'den 20'ye kadar olan çift sayıların küplerinin toplamı: " + toplam);
    }
}
