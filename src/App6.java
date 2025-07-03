public class App6 {
    public static void main(String[] args) {
        /*6) 
        Inverti l’array
        Obiettivo: Stampa gli elementi dell’array in ordine inverso.
        Esempio: int [] a = {1, 2, 3, 4, 5}
        Output: 5, 4, 3, 2, 1 */

        int[] a = { 1, 2, 3, 4, 5};

        for (int i = (a.length - 1); i > 0; i--) {

            int result = a[i];

            System.out.println(result);
        }

        for (int i = 0; i < a.length; i++) {

            int reverseIndex = a.length - 1 - i;
            int resultReversed = a[reverseIndex];

            System.out.println(resultReversed);
        }
    }
}
