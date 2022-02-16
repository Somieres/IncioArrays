import java.util.Scanner;

public class Boletin8_Ejercicio1 {
/*
Ejercicio 1.- Implementa una clase de utilidad donde se contemplen funcionalidades como:


 Dado un array de números enteros, generar a partir de él un nuevo array donde se
almacenen los elementos del primero que sean primos.
 A partir de un array generar otro con los elementos al revés.
 Funcionalidad que reciba un array de enteros y un número y devuelva la posición en la que
lo encuentre y -1 si el número no está en el array. En el array no puede haber números
repetidos.
 */

/*
 Dado un array cargado aleatoriamente, generar a partir de él otro array que contenga los
elementos pares que se encuentran en el primero.
 */
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


       /* System.out.println("¿Cuantos elementos quiere introducir en el array?");
        int numeroElementos=sc.nextInt();

        int[] array=new int[numeroElementos];

        System.out.println("Introducimos los numeros aleatoriamente");

        for(int i=0;i< array.length;i++){
            array[i]=(int)(Math.random()*30);

            System.out.println(array[i]);
        }

        System.out.println("Sacamos por consola los pares");
        for (int j = 0; j < array.length ; j++) {

            if (array[j]%2==0)
            System.out.println(array[j]);

        }*/

/*
 Crear un array de 20 elementos, con números aleatorios comprendidos entre 100 y 300, de
forma que no se repita ningún elemento.
 */

        int [] array2=new int[10];
        int variable=0;
        boolean repetido=false;

        /**
         * introducimos el valor del random en la variable 'variable', para poder recorrer el array de nuevo
         * sin la necesidad de tener un array de dos dimensiones
         */
        for (int i=0;i<array2.length;i++){
            variable=(int)(1+Math.random()*10);
/**
 * para j=0, mientras que sea menor o igual a i, es decir la posicion que ocupa la 'i' en el array
 *  aumentamos
 *
 */
            for (int j = 0; j <= i && repetido==false; j++) {

                if (variable == array2[j]) {
                    repetido = true;
                }
            }
                if (!repetido) {
                   array2[i] = variable;
                    System.out.print(array2[i]+ ", ");
                }
                // le restamos una posicion, para cuando entre en el if, no imprima un cero, sino que
                // vuelva a la misma posicion y le asigne un valor
                else {repetido=false;
                i--;}


       }




    }
}
