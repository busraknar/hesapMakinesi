import java.util.Scanner;

public class Hesapmakinesi {
    public static void main(String[] args) {
        int s1, s2, secim;

        Scanner input = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz:");
        s1 = input.nextInt();
        System.out.println("2.sayıyı giriniz:");
        s2 = input.nextInt();

        System.out.println("1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme");
        System.out.println("Hangi işlem yapılsın?");
        secim = input.nextInt();
        switch (secim) {
            case 1:
                System.out.println("Toplam ="+(s1 + s2));
                break;

            case 2:
                System.out.println("Çıkarma =" +(s1-s2));
                break;

            case 3:
                System.out.println("Çarpma=" + (s1 *s2));
                break;

            case 4:
                System.out.println((s2!=0)  ? "Bölme ="+(s1/s2)  : "Bir sayı 0'a bölünemez.");
                break;


        }
    }
}
