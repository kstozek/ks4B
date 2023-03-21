import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź liczbę przejechanych kilometrów: ");
        double przejechaneKilometry = scanner.nextDouble();
        System.out.print("Wprowadź liczbę zużytych litrów paliwa: ");
        double zuzyteLitry = scanner.nextDouble();
        double kilometryNaLitrze = przejechaneKilometry / zuzyteLitry;
        System.out.println("Liczba kilometów na litrze: " + kilometryNaLitrze);
    }
}
