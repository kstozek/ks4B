package INF;

import java.awt.*;
import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wybierz pakiet: A, B lub C: ");
        String pakiet = scanner.nextLine().toUpperCase();

        System.out.print("Podaj liczbę minut rozmów: ");
        int minuty = scanner.nextInt();

        double cena;
        switch (pakiet){
            case "A":
                cena = 39.99;
                if(minuty <= 450) {
                    cena += 0;
                }else {
                    cena += (minuty - 450) * 0.45;
                }
                break;
            case "B":
                cena = 59.99;
                if(minuty <= 900){
                    cena += 0;
                }else {
                    cena += (minuty - 900) * 0.40;
                }
            case "C":
                cena = 69.99;
                break;
            default:
                System.out.println("Nieznazy pakiet!");
                return;

        }

        System.out.println("Miesięczny rachunek " + cena + " złotych.");
    }
}
