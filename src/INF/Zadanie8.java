package INF;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int liczbaPakietow;

        System.out.print("Podaj liczbę zakupionych pakietów: ");
        liczbaPakietow = scanner.nextInt();

        double rabat = 0.0;

        if(liczbaPakietow >= 10 && liczbaPakietow <= 19){
            rabat = 0.2;
        } else  if (liczbaPakietow >= 20 && liczbaPakietow <= 49){
            rabat = 0.3;
        } else if (liczbaPakietow >= 50 && liczbaPakietow <= 99) {
            rabat = 0.4;
        } else if (liczbaPakietow >= 100) {
            rabat = 0.5;
        }

        if(rabat > 0.0){
            System.out.println("Przypisano rabat w wysokości: " + (rabat * 100) + "%.");
        }else {
            System.out.println("Nie przypisano rabatu.");
        }

        double cenaPakietu = 99.0;
        double cenaLaczna = liczbaPakietow * cenaPakietu;
        double cenaPoRabacie = cenaLaczna * (1 - rabat);

        System.out.println("Łączna kwota zakupu po rabacie:" + cenaLaczna + " złoty "+ cenaPoRabacie);


    }
}
