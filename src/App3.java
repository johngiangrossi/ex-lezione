public class App3 {
    public static void main(String[] args) {
        /*3) 
        Somma degli elementi
        Obiettivo: Calcola la somma di tutti gli elementi di un array.
        Esempio: int [] a = {1, 2, 3, 4, 5}
        Output: 15
         */

        int[] a = { 1, 2, 3, 4, 5};

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        System.out.println("la somma di tutti i numeri è " + sum);
    }
}
