package U3;

import java.util.Scanner;

public class ej2 {
    /*
    Crea una función con la siguiente cabecera:

public String convierteEnMorse(int n)

Esta función convierte el número n al sistema Morse y lo devuelve en una
cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
Morse. Utiliza esta función en un programa para comprobar que funciona bien.
Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
desde el programa principal.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String morse;

        System.out.println("Introduce un número");
        n=sc.nextInt();

        morse=convierteEnMorse(n);

        System.out.println("Su número en morse es: " + morse);
    }
    public static String convierteEnMorse(int n){
        String num = n+"";
        String morse = "";

        for (int i = 0; i < num.length(); i++) {
            switch (num.charAt(i)){
                case '1':
                    morse=morse+" . _ _ _ _";
                    break;
                case '2':
                    morse=morse+" . . _ _ _";
                    break;
                case '3':
                    morse=morse+" . . . _ _";
                    break;
                case '4':
                    morse=morse+" . . . . _";
                    break;
                case '5':
                    morse=morse+" . . . . .";
                    break;
                case '6':
                    morse=morse+" _ . . . .";
                    break;
                case '7':
                    morse=morse+" _ _ . . .";
                    break;
                case '8':
                    morse=morse+" _ _ _ . .";
                    break;
                case '9':
                    morse=morse+" _ _ _ _ .";
                    break;
                case '0':
                    morse=morse+" _ _ _ _ _";
                    break;

              }
        }

        return morse;
    }
}
