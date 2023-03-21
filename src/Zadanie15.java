import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj cenę detaliczną płytki drukowanej: ");
        double cenaDeliczna = scanner.nextDouble();
        double zysk = cenaDeliczna * 0.4;

        System.out.printf("Zysk ze sprzedaży płytki drukowanej wynosi %2f zł.%n", zysk);
    }
}
