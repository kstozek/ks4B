import java.util.Scanner;


public class Zadanie16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwę swojego ulubionego miasta: ");

        String miasto = scanner.nextLine();
        int liczbaZankow = miasto.length();
        String nazwaMiastaDuzeLitery = miasto.toUpperCase();
        String nazwaMiastaMaleLitery = miasto.toLowerCase();
        char pierwszyZnak = miasto.charAt(0);

        System.out.println("Liczba znaków w nazwie miasta: " + liczbaZankow);
        System.out.println("Nazwa miasta zapisana wielkimi literami: " + nazwaMiastaDuzeLitery);
        System.out.println("Nazwa miasta zapisana małymi literami: " + nazwaMiastaMaleLitery);
        System.out.println("Pierwszy znak nazwy miasta: " + pierwszyZnak);
    }
}
