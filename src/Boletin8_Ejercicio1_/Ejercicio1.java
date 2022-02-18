package Boletin8_Ejercicio1_;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

    static Scanner sc = new Scanner(System.in);

    public static int introducirElementos() {

        System.out.println("Introduzca el numero de elementos que desea almacenar en el array");

        return sc.nextInt();
    }


    public static int[] crearRandom() {

        int[] valores = new int[introducirElementos()];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int) (Math.random() * 100);

        }
        return valores;
    }


/*
lo que quiero hacer aqui es que devuelva los valores pares, pero los impares aparecen como 0, por lo que tengo que
averiguar como no almacenar los impares como 0
  */
  /*  public static int[] devolverPar(){
        int [] par=crearRandom();
        int [] valores=new int[par.length];
      System.out.println(Arrays.toString(par));
        for (int i=0; i<par.length;i++)
        if (par[i]%2==0){
             valores [i] = par[i];
        }
             return valores;
    }*/

    public static int[] devolverPares(int[] array) {

        int contador = 0, j = -1;

        /*List<Integer> arrayl=new ArrayList<Integer>();
        for (int i=0; i<array.length;i++) {

            if (array[i] % 2 == 0) {
                //contador++;
                arrayl.add(array[i]);
            }
       }*/

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                contador++;
            }
        }
        int[] array2 = new int[contador];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                j++;
                array2[j] = array[i];
            }
        }
        return array2;
        //  System.out.println(System.lineSeparator()+"Hay un total de: "+ contador+ " numeros pares");
    }
        /*  Crear un array de 20 elementos, con números aleatorios comprendidos entre 100 y 300, de
    forma que no se repita ningún elemento.*/

    public static void crearArray20() {

        int[] valores = new int[20];
        int variable = 0;
        boolean repetido = false;

        for (int i = 0; i < valores.length; i++) {
            variable = (int) (100 + Math.random() * 200);
            for (int j = 0; j <= i && repetido == false; j++) {
                if (variable == valores[j]) {
                    repetido = true;
                }
            }
            if (!repetido) {
                valores[i] = variable;
                System.out.print(valores[i] + ", ");
            } else {
                repetido = false;
                i--;
            }
        }
        System.out.println(System.lineSeparator());
    }

    /*  Dado un array de números enteros, generar a partir de él un nuevo array donde se
almacenen los elementos del primero que sean primos. */


    public static void generarPrimos(int[] array, int[] array2) {

        boolean esPrimo = false;

        for (int i = 0; i < array.length; i++) {
            esPrimo = validarSiPrimo(array[i]);
            if (esPrimo) {
                for (int j = 0; j < array.length; i++) {

                    if (array[i] % 2 == 0) {
                        array2[j] = array[i];
                        j++;
                    }
                    j--;
                }
            }
        }
    }

    private static boolean validarSiPrimo(int num) {

        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != num)) {
            if (num % contador == 0)
                primo = false;
            contador++;
        }
        return primo;

    }
    /* A partir de un array generar otro con los elementos al revés.*/

    public static void invertirArray(int[] array) {

        System.out.print("Los valores iniciales del array son los siguientes: " + Arrays.toString(array) + ", " +
                System.lineSeparator());
        System.out.println("los valores invertidos son: ");
        for (int i = array.length - 1; i >= 0; i--) {
            int valor = array[i];
            System.out.print(valor + ", ");
        }
    }
        /* Funcionalidad que reciba un array de enteros y un número y devuelva la posición en la que
        lo encuentre y -1 si el número no está en el array. En el array no puede haber números
        repetidos.*/

    public static int localizarNumero(int[] array, int num) {

        boolean encontrado = false;
        int numero = -1;
        System.out.println("El array esta compuesto de: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {

            if (array[i] == num) {
                encontrado = true;
                numero = array[i];
            }
        }


        return numero;
    }

}
