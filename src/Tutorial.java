import java.util.Scanner;

public class Tutorial{
    public static void main(String[]args){

        float armutFiyat = 2.14F;
        float elmaFiyat = 3.67F;
        float domatesFiyat = 1.11F;
        float muzFiyat = 0.95F;
        float patlicanFiyat = 5F;

        Scanner scanner = new Scanner(System.in);

        float armutAdet = scanner.nextFloat();
        float elmaAdet = scanner.nextFloat();
        float domatesAdet = scanner.nextFloat();
        float muzAdet = scanner.nextFloat();
        float patlicanAdet = scanner.nextFloat();

        float totalPrice = (armutAdet * armutFiyat) + (elmaAdet * elmaFiyat) + (domatesAdet * domatesFiyat) + (muzAdet * muzFiyat) + (patlicanAdet * patlicanFiyat);
        System.out.println(totalPrice + " TL");
    }
}
