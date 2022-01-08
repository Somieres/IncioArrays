package cuentaBancaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String nombre, numero;
        double tipo, importe;

        Cuenta cuenta1;
        cuenta1 = new Cuenta();

        System.out.print("Nombre: ");
        nombre=sc.nextLine();
        System.out.print("Numero de cuenta: ");
        numero=sc.nextLine();
        System.out.print("Tipo de interés: ");
        tipo=sc.nextDouble();
        System.out.print("Saldo: ");
        importe=sc.nextDouble();

        cuenta1.setNombre(nombre);
        cuenta1.setNumeroCuenta(numero);
        cuenta1.setTipoInteres(tipo);
        cuenta1.setSaldo(importe);

        //creamos cuenta2

        Cuenta cuenta2=new Cuenta("Juan Fernandez Rubio", "123456788901234567890",1.75,300);

        Cuenta cuenta3 = new Cuenta();

        System.out.println("Datos cuenta1");
        System.out.println("Nombre del titular: "+cuenta1.getNombreCliente());
        System.out.println("Numero de cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Tipo de interés: " + cuenta1.getTipoInteres());
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println();

        //Mostrar los datos de cuenta2

        System.out.println("Datos cuenta2");
        System.out.println("Nombre del titular: "+cuenta2.getNombreCliente());
        System.out.println("Numero de cuenta: " + cuenta2.getNumeroCuenta());
        System.out.println("Tipo de interés: " + cuenta2.getTipoInteres());
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();

        //Mostrar cuenta3

        System.out.println("Datos cuenta3");
        System.out.println("Nombre del titular: "+cuenta3.getNombreCliente());
        System.out.println("Numero de cuenta: " + cuenta3.getNumeroCuenta());
        System.out.println("Tipo de interés: " + cuenta3.getTipoInteres());
        System.out.println("Saldo: " + cuenta3.getSaldo());
        System.out.println();



    }
}
