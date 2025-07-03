public class App8 {
    public static void main(String[] args) {
        /*8) 
        Array di stringhe: stampa i nomi che iniziano per A
        Obiettivo: Dato un array di nomi, stampa solo quelli che iniziano con la lettera 'A'.
        Esempio: String[] nomi = {"Anna", "Luca", "Alberto", "Giulia", "Andrea"};
        Output: Anna, Alberto, Andrea*/

        String[] names = { "Anna", "Luca", "Alberto", "Giulia", "Andrea" };
        char letterToCompare = 'A';

        for (int i = 0; i < names.length; i++) {
            String name = names[i];

            //System.out.println(name);

            if (name.charAt(0) == letterToCompare) {
                System.out.println(name);
            }

        }
    }
}
