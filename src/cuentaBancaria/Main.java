package cuentaBancaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      Cuenta cuenta1=new Cuenta("Papas Fritas", "258788454654646", 2.0, 50);

      Cuenta cuenta2=new Cuenta("Chusma", "200788454654646", 10.0, 1);

      Cuenta cuenta3=new Cuenta("Tio Gilito", "258748848", 0.5, 1000000);


        System.out.println(cuenta3.realizarTransferencia(cuenta2, 50000));
        System.out.println("Su saldo ha aumentado a: "+ cuenta2.getSaldo());

        System.out.println(cuenta3.getSaldo());
    }
}
