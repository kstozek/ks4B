import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Wprowadź wynik z pierwszeego testu: ");
        double test1 = input.nextDouble();

        System.out.print("Wprowadź wynik z drugiego testu: ");
        double test2 = input.nextDouble();

        System.out.print("Wprowadź wynik z trzeciego testu: ");
        double test3 = input.nextDouble();

        double srednia = (test1 + test2 + test3) / 3;

        System.out.println("Wynik z pierwszego testu: " + test1);
        System.out.println("Wynik z drugiego testu: " + test2);
        System.out.println("Wynik z trzeciego testu: " + test3);
        System.out.println("Średnia: "  + srednia);


    }
}
