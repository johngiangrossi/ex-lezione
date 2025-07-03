public class App5 {
    public static void main(String[] args) {
        /*5) 
        Trova il minimo
        Obiettivo: Trova il valore minimo all’interno di un array.
        Esempio: int [] a = {1, 2, 3, 4, 5}
        Output: 1 */

        int[] a = { 1, 2, 3, 4, 5 };

        int maxNumber = a[0];

        for (int i = 0; i < a.length; i++) {
            int number = a[i];

            System.out.println(number);

            if (number < maxNumber) {
                maxNumber = number;
            }
        }

        System.out.println("il valore massimo è " + maxNumber);

    }
}
