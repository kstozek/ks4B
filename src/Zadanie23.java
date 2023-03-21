import java.util.Scanner;

public class zadanie23 {
    public static void main(String[] args) {
        float R;
        Scanner dane = new Scanner(System.in);
        System.out.println("Podaj dlugosc rzedu w metrach : " );
        R = dane.nextInt();
        int E;
        System.out.println("Ilosc miejsca zajmowanego przez okratowanie  w metrach : " );
        E = dane.nextInt();
        float S;
        System.out.println("Odleglosc miedzy sadzonkami w metrach : " );
        S = dane.nextInt();
        float P=E*2;
        double B= (R-P);
        double V = B/S;
        System.out.println("Ilosc sadzonek jakie zmieszcza sie w rzedzie to : "+ V);

    }