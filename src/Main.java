import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = inp.nextInt();

        if (isAsal(sayi)) {
            System.out.println("Girilen sayı asal sayıdır.");
        } else {
            System.out.println("Girilen sayı asal sayı değildir.");
        }
    }

    static boolean isAsal(int sayi) {
        int sayac = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
            }
        }
        if (sayac == 0) {
            return true;
        } else {
            return false;
        }

    }
}