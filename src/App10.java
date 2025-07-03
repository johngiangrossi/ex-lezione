import java.util.Scanner;

public class App10 {
    public static void main(String[] args) {
        /*10) 
        Rettangolo pieno di asterischi
        Obiettivo: Dato un numero di righe e un numero di colonne stampare un rettangolo pieno di asterischi
        Esempio: Con righe = 4 e colonne = 6
        Output:
        ******
        ******
        ******
        ****** */

        Scanner scan = new Scanner(System.in);
        System.out.print("inserire il numero di colonne: ");

        int colNumber = scan.nextInt();
        System.out.println("il numero delle colonne è: " + colNumber);

        System.out.print("inserire il numero di righe: ");

        int rowNumber = scan.nextInt();
        System.out.println("il numero delle righe è: " + rowNumber);

        String empty = "";
        String result = "*";
        for (int i = 0; i < colNumber; i++) {
            for (int j = 0; j < rowNumber; j++) {
            
                System.out.print(result);

            }
            System.out.println(empty);

        }

    }
}
