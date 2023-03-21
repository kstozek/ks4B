import java.util.Scanner;

public class Zadanie21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Wprowadź kwotę początkowo zdeponowaną na konie: ");
        double P = input.nextDouble();

        System.out.print("Wprowadź roczną stopę oprocentowania (w procentach): ");
        double r = input.nextDouble() / 100;

        System.out.print("Wprowadź liczbę razy w roku odsedki są kapotalizowane: ");
        int n = input.nextInt();

        System.out.print("Wprowadź liczbę lat, przez jakie środki będą znjadować sie na konce: ");
        int t = input.nextInt();

        double A = P * Math.pow(1 + r/n, n*t);

        System.out.println("Kwota, jaka znajdzie sie na koncie po " + t + " latach: " + A);

    }
}
