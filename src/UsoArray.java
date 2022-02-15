import java.util.Scanner;

public class UsoArray {

    static Scanner sc= new Scanner(System.in);


    public static void main(String[] args) {


        int[] datos=new int[10];

        System.out.println("Introducir datos");
        for (int i=0; i<datos.length; i++){
            System.out.println("introduzca los datos " + i);
            datos[i]=sc.nextInt();
        }

        System.out.println("Los datos introducidos son ");
        for (int i=0;i<datos.length;i++){
            if(i%2==0){
                System.out.println(datos[i]);
            }

        }


    }
}
