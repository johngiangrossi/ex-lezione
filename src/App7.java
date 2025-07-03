import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        /*7) 
        Inverti la stringa
        Obiettivo: Chiedi all'utente una stringa e stampala al contrario.
        Esempio: Ciao
        Output: oaiC */

        Scanner scan = new Scanner(System.in);
        System.out.print("inserisci una parola: ");

        String userWord = scan.nextLine();
        System.out.println("la parola inserita è: " + userWord);



        int userWordLenght = userWord.length();
        
        for (int i = 0; i < userWordLenght; i++) {
            int reverseIndex = userWordLenght - 1 - i;
            char letter = userWord.charAt(reverseIndex);
            System.out.print(letter);
        }
        
        for (int i = userWordLenght - 1; i >= 0; i--) {
            char letter = userWord.charAt(i);
            System.out.print(letter);
        }


    }

}
