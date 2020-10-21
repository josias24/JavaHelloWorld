package helloWorld;

public class BucleDoWhile {
    public static void main(String[] args) {

        int x = 1;
        do {
            System.out.println(x);
            x++;
        } while (x < 5);
    } /* esta garantizado que se va a ejecutar al menos una vez incluso con una condicion falsa /
    la condicion aparece al final del bucle */
}