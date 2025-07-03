
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*1) 
        Tabellina
        Obiettivo: Chiedere all'utente di quale numero stampare la tabellina e fino a quale numero arrivare.
        Esempio: numeroTabellina 5, numeroFineTabellina 10
        Output: 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("quale numero stampare la tabellina: ");

        int numberTimeTable = scan.nextInt();
        System.out.println("il numero dell'utente è: " + numberTimeTable);

        System.out.print("fino a quale numero arrivare: ");

        int numberFinalTimeTable = scan.nextInt();
        System.out.println("il numero finale è: " + numberFinalTimeTable);

        for (int i = 0; i < numberFinalTimeTable; i++) {
            int result = i * numberTimeTable;
            System.out.println(result);
        }
    }
}
