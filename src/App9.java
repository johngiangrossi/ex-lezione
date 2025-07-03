import java.util.Scanner;

public class App9 {
    public static void main(String[] args) {
        /*9) 
        Triangolo di asterischi (crescente)
        Obiettivo: Dato un numero n stampare un albero di asterischi crescente:
        Esempio: n = 5
        Output:
        *
        **
        ***
        ****
        ***** */

        Scanner scan = new Scanner(System.in);
        System.out.print("inserire un numero: ");

        int numberUser = scan.nextInt();
        System.out.println("il numero dell'utente è: " + numberUser);

        String result = "";
        for (int i = 0; i < numberUser; i++) {
            result += "*";
            System.out.println(result);
        }
    }
}
