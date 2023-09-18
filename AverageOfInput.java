import java.util.Scanner;
public class AverageOfInput {
    public static void main(String[] args){


        

         Scanner szam = new Scanner(System.in);
        System.out.println("Kérek egy számot:");
        int egy = szam.nextInt();
         Scanner szam2 = new Scanner(System.in);
        System.out.println("Kérek egy számot:");
        int keto = szam2.nextInt();
         Scanner szam3 = new Scanner(System.in);
        System.out.println("Kérek egy számot:");
        int harom = szam3.nextInt();
         Scanner szam4 = new Scanner(System.in);
        System.out.println("Kérek egy számot:");
        int negy = szam4.nextInt();
         Scanner szam5 = new Scanner(System.in);
        System.out.println("Kérek egy számot:");
        int ot = szam5.nextInt();

        int add=egy+keto+harom+negy+ot;
        double atlag=(egy+keto+harom+negy+ot)/5;
        System.out.println("Öszeadva: "+add+" Átlag: "+atlag);

        



    }}
