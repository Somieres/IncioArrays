package ArraysEjemplosTemario;

import java.util.Scanner;

public class AumentoArray {

    public static void main(String[] args) {


        // se le suma a la cantidad inicial la cantidad que desees de 'celdas'
        int[] array = new int[4];
        //en este caso, aunementamos en 8 por lo que en total hay 12
        int[] nuevo = new int[array.length + 8];
        System.out.println("Aumento Array ");
        System.out.println(nuevo.length);

        System.out.println();
        System.out.println("Notas Array ");


        // Bucle for each

        int[] notas = {1, 5, 8, 9, 10, 15, 21};

        for (int i : notas) {
            System.out.println(i);

        }
        // llamada al metodo del array

        mostrarNotas(ponerNota(nuevo));
    }

    static Scanner sc = new Scanner(System.in);

    public static int[] ponerNota(int[] nuevo) {


        System.out.println("Introducimos valores");
        for (int i = 0; i < nuevo.length; i++) {
            System.out.println("Introduzca los valores " + (i + 1));
            nuevo[i] = sc.nextInt();
        }
        return nuevo;
    }


    //Notas Array

    public static void mostrarNotas(int[] arrayNotas) {

        for (int i = 0; i < arrayNotas.length; i++) {

            System.out.println("La nota en la posicion " + (i + 1) + " es: " + arrayNotas[i]);
        }


    }


}
