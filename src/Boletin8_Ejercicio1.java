import java.util.Scanner;

public class Boletin8_Ejercicio1 {
/*
Ejercicio 1.- Implementa una clase de utilidad donde se contemplen funcionalidades como:
 Dado un array cargado aleatoriamente, generar a partir de él otro array que contenga los
elementos pares que se encuentran en el primero.
 Crear un array de 20 elementos, con números aleatorios comprendidos entre 100 y 300, de
forma que no se repita ningún elemento.
 Dado un array de números enteros, generar a partir de él un nuevo array donde se
almacenen los elementos del primero que sean primos.
 A partir de un array generar otro con los elementos al revés.
 Funcionalidad que reciba un array de enteros y un número y devuelva la posición en la que
lo encuentre y -1 si el número no está en el array. En el array no puede haber números
repetidos.
 */


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        System.out.println("¿Cuantos elementos quiere introducir en el array?");
        int numeroElementos=sc.nextInt();

        int[] array=new int[numeroElementos];

        System.out.println("Introducimos los numeros aleatoriamente");

        for(int i=0;i< array.length;i++){
            array[i]=(int)(Math.random()*30);
            System.out.println(array[i]);
        }


    }
}
