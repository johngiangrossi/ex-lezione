
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        /*2) 
        Fattoriale di un numero
        Obiettivo: Chiedere all'utente un numero n e calcola il suo fattoriale.
        Esempio: n = 5
        Output: 5x4x3x2x1 = 120
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("inserire un numero: ");

        int numberUser = scan.nextInt();
        System.out.println("il numero dell'utente è: " + numberUser);

        int factorial = 1;
        for (int i = 1; i <= numberUser; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
