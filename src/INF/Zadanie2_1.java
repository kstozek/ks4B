package INF;

import java.util.Scanner;
public class Zadanie2_1 {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        int dzien, miesiac, rok;

        System.out.println("Podaj dzień miesiąca: ");
        dzien = dane.nextInt();
        dane.nextLine();

        System.out.println("Podaj miesiąc: ");
        miesiac = dane.nextInt();
        dane.nextLine();

        System.out.println("Podaj ostatnie dwie cyfry roku: ");
        rok = dane.nextInt();

        if(dzien*miesiac == rok){
            System.out.println("Data jest magiczna");
        } else {
            System.out.println("Data nie jest magiczna");
        }

    }
}
