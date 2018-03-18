import java.util.Scanner;

class PobieranieDanych {
    String zgaduj() {
        Scanner pobierz = new Scanner(System.in);
        System.out.print("Typuje pole: ");
        String liczba = pobierz.next();
        return liczba;
    }
}