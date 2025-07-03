public class App4 {
    public static void main(String[] args) {
        /*4) 
        Trova il massimo
        Obiettivo: Trova il valore massimo all'interno di un array di interi.
        Esempio: int [] a = {1, 2, 3, 4, 5}
        Output: 5 */

        int[] a = { 1, 2, 3, 4, 5 };

        int maxNumber = 0;

        for (int i = 0; i < a.length; i++) {
            int number = a[i];

            System.out.println(number);

            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        System.out.println("il valore massimo è " + maxNumber);

    }
}
