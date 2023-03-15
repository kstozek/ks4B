public class Zadanie6 {
    public static  void main(String[] args){
        int PierwszyPokoj = 3*4;
        int DrugiPokoj = 3*4;
        int TrzeciPokoj = 2*3;
        int CzwartyPokoj = 2*2;
        int powierzchnia_mieszkania = PierwszyPokoj+ DrugiPokoj + TrzeciPokoj + CzwartyPokoj;
        int powierzchnia_na_osobe = powierzchnia_mieszkania/4;
        System.out.println("Powierzchnia 1 pokoju: " + PierwszyPokoj + "m2");
        System.out.println("Powierzchnia 2 pokoju: " + DrugiPokoj + "m2");
        System.out.println("Powierzchnia 3 pokoju: " + TrzeciPokoj + "m2");
        System.out.println("Powierzchnia 4 pokoju: " + CzwartyPokoj + "m2");
        System.out.println("Powierzchnia calego mieszkania: " + powierzchnia_mieszkania + "m2");
        System.out.println("Powierzchnia na osobe: " + powierzchnia_na_osobe + "m2");
    }
}


