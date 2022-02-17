package Boletin8_Ejercicio1_;

import java.util.Arrays;
import java.util.Scanner;

public class Menu_Boletin8_Ejercicio1 {

     static Scanner sc=new Scanner(System.in);

     public static String leerDato(){
         return sc.next();
     }
     public static int leerOpcion(){

         return sc.nextInt();
    }

     public static void pintarMenu(){



        System.out.println("""
                ----------    [Elija entre las diferentes opciones]    ----------
                -----------------------------------------------------------------
                [1] Conocer los elementos pares de un array creado al azar
                [2] Crear un array de 20 elementos entre 100 y 300
                [3] Conocer los valores primos de un array creado al azar
                [4] Invertir los elementos de un array creado al azar
                [5] Conocer la si un numero se encuentra dentro de un array creado al azar
                [0] Salir
                ******************************************************************""");

    }

    public static void elegirOpcion(){


         boolean salirMenu=false;


        do {

            pintarMenu();


            switch (leerDato()){

                case "1":
                    int[] array=Ejercicio1.crearRandom();
                    int[] array2=new int[array.length];

                    Ejercicio1.devolverPares(array, array2);

                    System.out.println(Arrays.toString(array2));
                break;
                case "2":
                    Ejercicio1.crearArray20();
                    break;
                case"3":
                    int[] array3=Ejercicio1.crearRandom();
                    int[] array2_3=new int[array3.length];
                    Ejercicio1.generarPrimos(array3,array2_3);
                    break;
                case "4":
                    int[] array4=Ejercicio1.crearRandom();
                    Ejercicio1.invertirArray(array4);
                    break;
                case "5":
                    int[] array5=Ejercicio1.crearRandom();
                    System.out.println(Ejercicio1.localizarNumero(array5,leerOpcion());
                    break;
                case "0":
                    salirMenu=true;
            }
        }while (!salirMenu);

    }
}
