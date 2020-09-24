import java.util.Scanner;

public class opgave44 {

    public static void main(String[] args) {

        System.out.println("Voer een woord in");
        Scanner invoer = new Scanner(System.in);
        String woord = invoer.nextLine();
        System.out.println(woord.length());
        System.out.println("Voer een getal in");
        int getal = invoer.nextInt();
        System.out.println("de tafel van 288 is: ");
        int uitkomst = getal * 1;
        int uitkomst2 = getal * 2;
        System.out.println("1 * " + getal + " = " + uitkomst);
        System.out.println("1 * " + getal + " = " + uitkomst2);



    }
}
