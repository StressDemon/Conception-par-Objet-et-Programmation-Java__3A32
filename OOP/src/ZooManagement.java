import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args){

        System.out.println("Welcome to your new zoo manager!");

        Scanner nameScanner = new Scanner(System.in);
        System.out.println("Wha do you wanna call your new zoo?");

        String ZooName = nameScanner.nextLine();

        System.out.println("I see...");

        Scanner cagesScanner = new Scanner(System.in);
        System.out.println("And how many cages do you want in it?");

        int nbrCages = cagesScanner.nextInt();

        System.out.println("how lovely, just to recap, \"" + ZooName + "\" has " + nbrCages + " cages.");
    }
}
