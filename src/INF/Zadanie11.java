package INF;

import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj nazwisko i czas ukończenia biegu dla każdego z trzech biegaczy:");
        System.out.print("Biegacz 1: ");
        String nazwisko1 = scanner.next();
        int czas1 = scanner.nextInt();
        System.out.print("Biegacz 2: ");
        String nazwisko2 = scanner.next();
        int czas2 = scanner.nextInt();
        System.out.print("Biegacz 3: ");
        String nazwisko3 = scanner.next();
        int czas3 = scanner.nextInt();


        System.out.println("Kolejność na mecie:");
        if (czas1 < czas2 && czas1 < czas3) {
            System.out.println(nazwisko1);
            if (czas2 < czas3) {
                System.out.println(nazwisko2);
                System.out.println(nazwisko3);
            } else {
                System.out.println(nazwisko3);
                System.out.println(nazwisko2);
            }
        } else if (czas2 < czas1 && czas2 < czas3) {
            System.out.println(nazwisko2);
            if (czas1 < czas3) {
                System.out.println(nazwisko1);
                System.out.println(nazwisko3);
            } else {
                System.out.println(nazwisko3);
                System.out.println(nazwisko1);
            }
        } else {
            System.out.println(nazwisko3);
            if (czas1 < czas2) {
                System.out.println(nazwisko1);
                System.out.println(nazwisko2);
            } else {
                System.out.println(nazwisko2);
                System.out.println(nazwisko1);
            }
        }
    }
}
