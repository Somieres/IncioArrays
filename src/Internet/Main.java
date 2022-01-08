package Internet;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {



        int n1;
        int n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        n1=sc.nextInt();
        System.out.println("Introduzca el segundo numero");
        n2=sc.nextInt();

        Operacion op=new Operacion();

        int suma = op.sumar(n1,n2);
        int resta = op.restar(n1,n2);
        int mult = op.multiplicar(n1,n2);
        int div = op.dividir(n1,n2);
        op.mostrarResultados(suma, resta, mult, div);
    }

}
